class Solution:
    def isValid(self, s: str) -> bool:
        stack = []
        c = {']':'[', '}':'{', ')':'('}

        for i in s:
            if i in c:
                if(stack and stack[-1] == c.get(i)):
                    stack.pop()
                else:
                    return False
            else:
                stack.append(i)
        
        if len(stack) == 0:
            return True
        else:
            return False