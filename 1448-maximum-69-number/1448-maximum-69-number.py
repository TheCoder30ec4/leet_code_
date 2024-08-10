class Solution:
    def maximum69Number (self, num: int) -> int:

        if num == 9999:
            return num
        if num == 6666:
            return 9666

        numStr = str(num)
        numList = list(numStr)

        for i in range(len(numList)):
            if(numList[i] == '6'):
                numList[i]= '9'
                break
            else:
                continue

        numStr = ''.join(numList)
        return int(numStr)
            
        
        