class Solution:
    def hasMatch(self, s, p):
        prefix, suffix = p.split('*')
        pos = s.find(prefix)
        if pos == -1:
            return False
        pos += len(prefix)
        if suffix == '' or suffix in s[pos:]:
            return True
        else:
            return False
