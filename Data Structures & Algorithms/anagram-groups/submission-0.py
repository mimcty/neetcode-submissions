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
                anagramDict[string] = [idx]             # initialize sorted string: index (in list)
            else:
                anagramDict[string].append(idx)         # append this index to existing index list
                
        # get values from dict (the indices to use for each sublist) and add the values to new sublists
        retList = []
        for sublist in anagramDict.values():
            newSublist = []

            for idx in sublist:
                newSublist.append(strs[idx])

            retList.append(newSublist)

        return retList