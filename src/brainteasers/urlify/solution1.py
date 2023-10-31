"""
From Cracking the Coding Interview, Exercise 1.3

URLify: Write a method to replace all spaces in a string with '%20: You may assume that the string
has sufficient space at the end to hold the additional characters, and that you are given the "true"
length of the string. (Note: if implementing in Java, please use a character array so that you can
perform this operation in place.)

EXAMPLE
Input: "Mr John Smith   ", 13
Output: "Mr%20John%20Smith"
"""

import unittest
import re

REPLACE_WITH = '%20'
WHITESPACE = ' '


def run(str_input):
    str_input = strip_whitespaces(str_input)
    str_input = truncate_adjacent_whitespaces(str_input)
    return replace_all(str_input)


def strip_whitespaces(str_input):
    return str_input.strip()


def truncate_adjacent_whitespaces(str_input):
    return re.sub("\s\s+", WHITESPACE, str_input)


def replace_all(str_input):
    return str_input.replace(WHITESPACE, REPLACE_WITH)


class TestURLify(unittest.TestCase):
    def test_strip(self):
        self.assertEqual(strip_whitespaces(
            '   Mr John Smith     '), 'Mr John Smith')

    def test_remove_adjacent(self):
        self.assertEqual(truncate_adjacent_whitespaces(
            'Mr   John  Smith'), 'Mr John Smith')

    def test_urlify_1(self):
        self.assertEqual(run('Mr John Smith     '), 'Mr%20John%20Smith')

    def test_urlify_2(self):
        self.assertEqual(run('Mr John Smith'), 'Mr%20John%20Smith')

    def test_urlify_3(self):
        self.assertEqual(run('MrJohn Smith'), 'MrJohn%20Smith')

    def test_urlify_4(self):
        self.assertEqual(run('MrJohnSmith'), 'MrJohnSmith')

    def test_urlify_5(self):
        self.assertEqual(run('   MrJohn Smith'), 'MrJohn%20Smith')

    def test_urlify_6(self):
        self.assertEqual(run('Mr   John   Smith'), 'Mr%20John%20Smith')

    def test_urlify_7(self):
        self.assertEqual(run('  Mr   John   Smith  '), 'Mr%20John%20Smith')

    def test_urlify_8(self):
        self.assertEqual(run(' Mr   John   Smith '), 'Mr%20John%20Smith')


if __name__ == '__main__':
    unittest.main()
