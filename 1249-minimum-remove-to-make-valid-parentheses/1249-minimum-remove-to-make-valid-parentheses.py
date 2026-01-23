class Solution:
    def minRemoveToMakeValid(self, s):
        stack = []
        to_remove = set()

        # First pass: identify all parentheses that need to be removed
        for i, char in enumerate(s):
            if char == '(':
                stack.append(i)
            elif char == ')':
                if stack:
                    stack.pop()
                else:
                    to_remove.add(i)

        # Add all unmatched '(' indices to to_remove
        to_remove.update(stack)

        # Second pass: construct the result string excluding the parentheses to remove
        return ''.join([char for i, char in enumerate(s) if i not in to_remove])