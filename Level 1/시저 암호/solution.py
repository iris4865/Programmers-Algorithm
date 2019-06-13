import string

def solution(s, n):
    lower = string.ascii_lowercase
    upper = string.ascii_uppercase
    text = ''
    for c in s:
        if c.islower():
            text += lower[(ord(c) - ord('a') + n) % len(lower)]
        elif c.isupper():
            text += upper[(ord(c) - ord('A') + n) % len(upper)]
        else:
            text += c
    return text
