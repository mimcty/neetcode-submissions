class Solution:

    def encode(self, strs: List[str]) -> str:
        lengths = ""
        encoded = f"{len(strs)}/"
        string = ""

        for s in strs:
            lengths += f"{len(s)},"
            string += s
        
        return encoded + lengths + string


    def decode(self, s: str) -> List[str]:
        decoded = []
        word_count = ""
        lengths = []
        pointer = 0

        while s[pointer] != "/":
            word_count += s[pointer]
            pointer += 1
        
        for i in range(int(word_count)):
            pointer += 1
            length = ""
            while s[pointer] != ",":
                length += s[pointer]
                pointer += 1
            lengths.append(int(length))
        
        print(lengths)
        pointer += 1
        
        for l in lengths:
            word = ""
            for i in range(l):
                word += s[pointer]
                pointer += 1
            decoded.append(word)

        return decoded
                
                    
