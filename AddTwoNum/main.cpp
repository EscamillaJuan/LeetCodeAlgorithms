#include<iostream>
struct ListNode {
    int val;
    ListNode *next;
    ListNode() : val(0), next(nullptr) {}
    ListNode(int x) : val(x), next(nullptr) {}
    ListNode(int x, ListNode *next) : val(x), next(next) {}
};

class Solution {
public:
    // ListNode* reverseLinkedList(ListNode* node) {
    //     ListNode* current = node;
    //     ListNode *prev = NULL, *next = NULL;
    //     while(current != NULL){
    //         next = current->next;
    //         current->next = prev;
    //         prev = current;
    //         current = next;
    //     }
    //     current = prev;
    //     return current;
    // }
    ListNode* addTwoNumbers(ListNode* l1, ListNode* l2) {
        ListNode* head = new ListNode();
        ListNode* current = head;
        uint8_t carry = 0, sum = 0;
        while(l1 != NULL || l2 != NULL || carry>0){
            sum = carry;
            if(l1 != NULL){
                sum += l1->val;
                l1 = l1->next;
            }
            if(l2 != NULL){
                sum += l2->val;
                l2 = l2->next;
            }
            carry = sum / 10;
            current->next = new ListNode(sum%10);
            current = current->next;
        }
        return head->next;
    }
};
int main(){
    Solution solution;

    // LinkedList 1
    ListNode *node1_l1 = new ListNode(2);
    ListNode *node2_l1 = new ListNode(4);
    ListNode *node3_l1 = new ListNode(9);
    node1_l1->next = node2_l1;
    node2_l1->next = node3_l1;

    // LinkedList 2
    ListNode *node1_l2 = new ListNode(5);
    ListNode *node2_l2 = new ListNode(6);
    ListNode *node3_l2 = new ListNode(4);
    ListNode *node4_l2 = new ListNode(9);
    node1_l2->next = node2_l2;
    node2_l2->next = node3_l2;
    node3_l2->next = node4_l2;

    ListNode* result = solution.addTwoNumbers(node1_l1, node1_l2);
    while(result != NULL) {
        std::cout<<result->val;
        result = result -> next;
    }
    std::cout<<"\n";

    delete node1_l1;
    delete node2_l1;
    delete node3_l1;
    delete node1_l2;
    delete node2_l2;
    delete node3_l2;
    delete node4_l2;
    return 0;
}