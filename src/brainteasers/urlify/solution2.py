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

REPLACE_WITH = '%20'
WHITESPACE = ' '


def run(str_input):
    input_list = list(str_input)
    input_list = strip_start_whitespaces(input_list)
    input_list = strip_end_whitespaces(input_list)
    input_list = truncate_adjacent_whitespaces(input_list)
    input_list = replace_all(input_list)
    return convert_to_string(input_list)


def strip_start_whitespaces(input_list):
    while input_list[0] == WHITESPACE:
        del input_list[0]
    return input_list


def strip_end_whitespaces(input_list):
    while input_list[len(input_list) - 1] == WHITESPACE:
        del input_list[len(input_list) - 1]
    return input_list


def truncate_adjacent_whitespaces(input_list):
    for i in reversed(range(len(input_list))):
        if input_list[i] == WHITESPACE and input_list[i + 1] == WHITESPACE:
            del input_list[i]
    return input_list


def replace_all(input_list):
    for i in range(len(input_list)):
        if input_list[i] == WHITESPACE:
            input_list[i] = REPLACE_WITH
    return input_list


def convert_to_string(input_list):
    string = ''
    for ch in input_list:
        string += ch
    return string


class TestURLify(unittest.TestCase):
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
