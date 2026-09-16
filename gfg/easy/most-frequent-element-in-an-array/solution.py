class Solution:
    def mostFreqEle(self, arr):
        freq = {}

        for x in arr:
            freq[x] = freq.get(x, 0) + 1

        return max(freq.keys(), key=lambda x: (freq[x], x))