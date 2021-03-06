
package DoublyLinkedList;

/**
 *
 * @author Franklin C.K
 */

public class EmployeeDoublyLinkedList {
    
    private EmployeeNode head; 
    private EmployeeNode tail; 
    
    private int size;  
    
    public void addToFront(Employee employee) { 
        
        EmployeeNode node = new EmployeeNode(employee); 
        node.setNext(head); 
        
        if (head == null) { 
            tail = node; 
        } else { 
            head.setPrevious(node); 
        }
        
        head = node; 
        size++; 
        
    }
    
    public void addToEnd(Employee employee) { 
        
        EmployeeNode node = new EmployeeNode(employee); 
        
        if (tail == null) { 
            head = node; 
        } else { 
            tail.setNext(node);
            node.setPrevious(tail); 
        }
        
        tail = node; 
        
        size++; 
    }
    
    public int getSize() { 
        return size; 
    }
    
    public boolean isEmpty() { 
        return head == null; 
    }
    
    public EmployeeNode removeFromFront() { 
        
        /* 
        if previous == null 
        */
        if (isEmpty()) { 
            return null; 
        }
        
        EmployeeNode removedNode = head; 
        
        //if only one node in the list 
        if (head.getNext() == null) { 
            tail = null; 
        } else { //incase there is 2 nodes or more 
            head.getNext().setPrevious(null); 
        }
        
        
        head = head.getNext(); 
        size--; 
        removedNode.setNext(null);
        return removedNode; 
    }
    
    public EmployeeNode removeFromEnd() { 
        
        if (isEmpty()) { 
            return null; 
        }
        
        EmployeeNode removedNode = tail; 
        
        if(tail.getNext() == null) { 
            head = null; 
        } else { 
            tail.getPrevious().setNext(null); 
        }
        
        tail = tail.getPrevious(); 
        size--; 
        
        removedNode.setPrevious(null); 
        return removedNode; 
    }
    
    public void printList() { 
        EmployeeNode current = head; 
        System.out.println("Head -> "); 
        while (current != null) { 
            System.out.println(current);
            System.out.println(" <-> "); 
            
            current = current.getNext(); 
        }
        
        System.out.println("null"); 
    }
    
}


