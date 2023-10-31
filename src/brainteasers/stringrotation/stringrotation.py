"""
From Cracking the Coding Interview, Exercise 1.9

Assume you have a method isSubstring which checks if one word is a substring
of another. Given two strings, s1 and s2, write code to check if s2 is a 
rotation of s1 using only one call to isSubstring (e.g., waterbottleu 
is a rotation of uerbottlewat ).
"""

import unittest


def is_rotation(s1, s2):
    if (len(s1) != len(s2)):
        return False
    return s1 in s2 + s2


class TestIsRotation(unittest.TestCase):
    def test_rotation_true(self):
        self.assertTrue(is_rotation('rot', 'otr'))
        self.assertTrue(is_rotation('waterbottle', 'erbottlewat'))

    def test_rotation_false(self):
        self.assertFalse(is_rotation('r', 'otr'))
        self.assertFalse(is_rotation('rot', 'otrotr'))


if __name__ == '__main__':
    unittest.main()
