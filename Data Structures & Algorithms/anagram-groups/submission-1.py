class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        sortedStrs = []

        for string in strs:
            sortedStrs.append("".join(sorted(string)))
        
        # add each sorted string into a dict
        # if string doesn't exist in dict, add key with the value being the index in sortedStrs (and strs)
        # if string exists in dict, add index of this string to value (list)

        anagramDict = {}
        for idx, string in enumerate(sortedStrs):
            if string not in anagramDict:
                anagramDict[string] = [strs[idx]]
            else:
                anagramDict[string].append(strs[idx])
                
        return list(anagramDict.values())
        