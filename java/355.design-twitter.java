import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

class Tweet implements Comparable<Tweet> {
    int id;
    int time;

    Tweet(int id, int time) {
        this.id = id;
        this.time = time;
    }

    public int compareTo(Tweet other) {
        return Integer.compare(other.time, this.time);
    }
}


class Twitter {

    Map<Integer, List<Tweet>> idToTweets;
    Map<Integer, HashSet<Integer>> idToFollowers;
    int time;

    public Twitter() {
        idToTweets = new HashMap<>();
        idToFollowers = new HashMap<>();
        time = 0;
    }

    public void postTweet(int userId, int tweetId) {
        idToTweets.putIfAbsent(userId, new ArrayList<>());
        idToTweets.get(userId).add(new Tweet(tweetId, time++));
    }

    public List<Integer> getNewsFeed(int userId) {
        Queue<Tweet> tweets = new PriorityQueue<>();
        tweets.addAll(getLast10Tweets(userId));
        for (int follower : idToFollowers.getOrDefault(userId, new HashSet<>())) {
            tweets.addAll(getLast10Tweets(follower));
        }

        List<Integer> res = new ArrayList<>();
        while (!tweets.isEmpty() && res.size() < 10) {
            res.add(tweets.poll().id);
        }
        return res;
    }

    public void follow(int followerId, int followeeId) {
        idToFollowers.putIfAbsent(followerId, new HashSet<>());
        idToFollowers.get(followerId).add(followeeId);
    }

    public void unfollow(int followerId, int followeeId) {
        idToFollowers.getOrDefault(followerId, new HashSet<>()).remove(followeeId);
    }

    private List<Tweet> getLast10Tweets(int userId) {
        List<Tweet> tweets = idToTweets.getOrDefault(userId, new ArrayList<>());
        return tweets.subList(Math.max(tweets.size() - 10, 0), tweets.size());
    }
}
