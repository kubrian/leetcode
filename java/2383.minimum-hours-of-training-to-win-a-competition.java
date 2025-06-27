class Solution {
    public int minNumberOfHours(int initialEnergy, int initialExperience, int[] energy,
            int[] experience) {
        int res = 0;
        for (int i = 0; i < energy.length; i++) {
            if (energy[i] >= initialEnergy) {
                res += energy[i] - initialEnergy + 1;
                initialEnergy = 1;
            } else {
                initialEnergy -= energy[i];
            }
            if (experience[i] >= initialExperience) {
                res += experience[i] - initialExperience + 1;
                initialExperience = experience[i] + 1;
            }
            initialExperience += experience[i];
        }
        return res;
    }
}
