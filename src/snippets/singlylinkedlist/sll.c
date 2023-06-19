/**
 * Implementation of a singly linked list.
 */
#include <stdio.h>
#include <stdlib.h>

typedef struct node
{
    char data;
    struct node *next;
} node;

node *get_new_node(char data);
node *update_head(node *head, node *node);
node *add(node *head, char data);
void print(node *head);
void free_all(node *head);

int main(void)
{
    node *head = NULL;
    char *s = "HELLO";

    for (int i = 0; s[i] != '\0'; i++)
    {
        head = add(head, s[i]);
    }
    print(head);
    free_all(head);
}

node *get_new_node(char data)
{
    node *new_node = malloc(sizeof(node));
    if (new_node == NULL)
        return NULL;

    new_node->data = data;
    new_node->next = NULL;
    return new_node;
}

node *update_head(node *head, node *node)
{
    node->next = head;
    return node;
}

node *add(node *head, char data)
{
    node *node = get_new_node(data);
    if (node == NULL)
        return NULL;
    return update_head(head, node);
}

void print(node *head)
{
    if (head == NULL)
        return;
    if (head->next != NULL)
        print(head->next);

    printf("%c\n", head->data);
}

void free_all(node *node)
{
    if (node == NULL)
        return;
    if (node->next != NULL)
        free_all(node->next);

    free(node);
}
