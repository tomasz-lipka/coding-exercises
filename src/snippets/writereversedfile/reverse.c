/**
 * Reads file using standard I/O and writes it in reversed order.
 * Usage: ./reverse <input file> <chunk size of chars> <start from char>
 *
 * Example 1
 * -----------
 * ./reverse samples/test-input-1.txt 6 9
 * input: OMMIT-MEchunk1chunk2chunk3chunk4
 * output: chunk4chunk3chunk2chunk1
 *
 * Example 2
 * -----------
 * ./reverse samples/test-input-2.txt 1 1
 * input: 123456
 * output: 654321
 */

#include <stdbool.h>
#include <stdio.h>
#include <stdlib.h>

int const ARGC = 4;
char const *OUTPUT_FILE_NAME = "out.txt";

void reverse(FILE *in_file, FILE *out_file, int start_from, int chunk_size);
bool is_past_start(long position, int start_from, int chunk_size);

int main(int argc, char *argv[])
{
    if (argc != ARGC)
    {
        printf("Usage: ./reverse <input file> <chunk size of chars> <start from char>\n");
        return 1;
    }

    char const *INPUT_FILE = argv[1];
    int const CHUNK_SIZE = atoi(argv[2]);
    int const START_FROM = atoi(argv[3]);

    if (CHUNK_SIZE == 0 || START_FROM == 0)
    {
        printf("Wrong <chunk size of chars> and/or <start from char> argument\n");
    }

    FILE *in_file = fopen(INPUT_FILE, "r");
    if (in_file == NULL)
    {
        printf("Wrong input file\n");
        return 1;
    }

    FILE *out_file = fopen(OUTPUT_FILE_NAME, "w");
    if (out_file == NULL)
        return 1;

    reverse(in_file, out_file, START_FROM, CHUNK_SIZE);

    fclose(in_file);
    fclose(out_file);
}

void reverse(FILE *in_file, FILE *out_file, int start_from, int chunk_size)
{
    size_t const ELEMENT_SIZE_IN_BYTES = sizeof(char) * chunk_size;
    int const NUM_OF_ELEMENTS = 1;
    int const TWO_CHUNK_SIZES = 2 * chunk_size;
    long position = 0;
    char buffer[chunk_size];

    fseek(in_file, -chunk_size, SEEK_END);
    do
    {
        fread(buffer, ELEMENT_SIZE_IN_BYTES, NUM_OF_ELEMENTS, in_file);
        fwrite(&buffer, ELEMENT_SIZE_IN_BYTES, NUM_OF_ELEMENTS, out_file);
        position = ftell(in_file);
        fseek(in_file, -TWO_CHUNK_SIZES, SEEK_CUR);

    } while (is_past_start(position, start_from, chunk_size));
}

bool is_past_start(long position, int start_from, int chunk_size)
{
    return position >= start_from + chunk_size;
}