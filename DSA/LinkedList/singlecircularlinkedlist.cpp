#include <iostream>
using namespace std;
struct Node
{
    int data;
    Node *next;
};
void insertAtBeginning(Node *&head, int value)
{
    Node *newNode = new Node();
    newNode->data = value;
    if (head == nullptr)
    { // Empty list
        newNode->next = newNode;
        head = newNode;
    }
    else
    {
        Node *temp = head;
        while (temp->next != head)
        { // Find last node
            temp = temp->next;
        }
        newNode->next = head;
        temp->next = newNode;
        head = newNode;
    }
}
void insertAtEnd(Node *&head, int value)
{
    Node *newNode = new Node();

    newNode->data = value;
    if (head == nullptr)
    { // Empty list
        newNode->next = newNode;
        head = newNode;
    }
    else
    {
        Node *temp = head;
        while (temp->next != head)
        { // Find last node
            temp = temp->next;
        }
        newNode->next = head;
        temp->next = newNode;
    }
}

void display(Node *head)
{
    if (head == nullptr)
    {
        cout << "List is empty!" << endl;
        return;
    }
    Node *temp = head;
    do
    {
        cout << temp->data << " -> ";
        temp = temp->next;
    } while (temp != head);
    cout << "(Head)" << endl;
}

void insertionAtPosition(Node *&head, int value, int position)
{
 
int main()
{
    Node *head = nullptr; // Initialize empty list
    insertAtBeginning(head, 10);
    insertAtBeginning(head, 20);
    insertAtEnd(head, 30);
    insertAtEnd(head, 40);
    cout << "Circular Linked List: ";
    display(head);
    return 0;
}
}