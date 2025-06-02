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
    {
        newNode->next = newNode;
        head = newNode;
    }
    else
    {
        Node *temp = head;
        while (temp->next != head)
        {
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
    {
        newNode->next = newNode;
        head = newNode;
    }
    else
    {
        Node *temp = head;
        while (temp->next != head)
        {
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

void deleteNode(Node *&head, int value)
{
    if (head == nullptr)
    {
        cout << "List is empty!" << endl;
        return;
    }

    Node *temp = head, *prev = nullptr;

    // **Case 1: Single node (Head itself)**
    if (head->data == value && head->next == head)
    {
        delete head;
        head = nullptr;
        return;
    }

    // **Case 2: Deleting the head node**
    if (head->data == value)
    {
        Node *last = head;
        while (last->next != head) // Find last node
        {
            last = last->next;
        }
        last->next = head->next; // Update last node's next
        Node *temp = head;
        head = head->next; // Move head to next node
        delete temp;
        return;
    }

    // **Case 3: Deleting other than head**
    do
    {
        prev = temp;
        temp = temp->next;

        if (temp->data == value)
        {
            prev->next = temp->next;
            delete temp;
            return;
        }

    } while (temp != head);

    cout << "Value not found in the list!" << endl;
}

int main()
{
    Node *head = nullptr; // Initialize empty list
    insertAtBeginning(head, 10);
    insertAtBeginning(head, 20);
    insertAtEnd(head, 30);
    insertAtEnd(head, 40);
    cout << "Circular Linked List: ";
    display(head);

    deleteNode(head, 20);
    cout << "After deleting 20: ";
    display(head);

    deleteNode(head, 40);
    cout << "After deleting 40: ";
    display(head);

    deleteNode(head, 10);
    cout << "After deleting 10: ";
    display(head);

    deleteNode(head, 30);
    cout << "After deleting 30: ";
    display(head);

    return 0;
}