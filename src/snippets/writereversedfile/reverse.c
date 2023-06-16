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
char const *output_file_name = "out.txt";

void reverse(FILE *in_file, FILE *out_file, int start_from, int chunk_size);
bool is_past_start(long position, int start_from, int chunk_size);

int main(int argc, char *argv[])
{
    if (argc != ARGC)
    {
        printf("Usage: ./reverse <input file> <chunk size of chars> <start from char>\n");
        return 1;
    }

    char const *input_file = argv[1];
    int const chunk_size = atoi(argv[2]);
    int const start_from = atoi(argv[3]);

    if (chunk_size == 0 || start_from == 0)
    {
        printf("Wrong <chunk size of chars> and/or <start from char> argument\n");
    }

    FILE *in_file = fopen(input_file, "r");
    if (in_file == NULL)
    {
        printf("Wrong input file\n");
        return 1;
    }

    FILE *out_file = fopen(output_file_name, "w");
    if (out_file == NULL)
        return 1;

    reverse(in_file, out_file, start_from, chunk_size);

    fclose(in_file);
    fclose(out_file);
}

void reverse(FILE *in_file, FILE *out_file, int start_from, int chunk_size)
{
    size_t const element_size_in_bytes = sizeof(char) * chunk_size;
    int const num_of_elements = 1;
    int const two_chunks_sizes = 2 * chunk_size;
    long position = 0;
    char buffer[chunk_size];

    fseek(in_file, -chunk_size, SEEK_END);
    do
    {
        fread(buffer, element_size_in_bytes, num_of_elements, in_file);
        fwrite(&buffer, element_size_in_bytes, num_of_elements, out_file);
        position = ftell(in_file);
        fseek(in_file, -two_chunks_sizes, SEEK_CUR);

    } while (is_past_start(position, start_from, chunk_size));
}

bool is_past_start(long position, int start_from, int chunk_size)
{
    return position >= start_from + chunk_size;
}