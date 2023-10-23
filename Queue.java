class Node
{
    int data;
    Node next;

    public Node(int data)
    {
        this.data = data;
    }
}

class Queue_linked
{
    Node front;//instead of head
    Node rear;//instead of tail

    boolean enqueue(int v)
    {
        Node nodeToAdd = new Node(v);

        if(isEmpty())
        {
            this.front = nodeToAdd;
            this.rear = nodeToAdd;
            return true;
        }
        else
        {
            rear.next = nodeToAdd;
            rear = nodeToAdd;
            return true;
        }
    }   

    Node dequeue()
    {
        
        Node nodeToDelete = front;

        if(!isEmpty())
        {
            if(front == rear) //if only one
            {
                front = null;
                rear = null;
            }
            else
            {
                front = front.next;
            }
        }
        else
        {
            System.out.println("List is empty");
        }
        return nodeToDelete;
    }

    boolean isFull()
    {
        return front == null;
    }

    boolean isEmpty()
    {
        return front == null;
    }

    public String toString()
    {
        String toReturn = "[";
        Node currentNode = this.front;

        if(front != null)
        {
            while (currentNode != null)
            {
                toReturn += currentNode.data;
                if (currentNode.next != null)
                {
                    toReturn += ", ";
                }
                currentNode = currentNode.next;
            }
        }

        toReturn += "]";

        return toReturn;
    }

    public Node Nodefront()
    {
        return front;
    }

}






/////////////////////////////////////////////////////////////////////////

class circularQueue 
{
    Node front;  // head
    Node rear;   // tail
    int N;       // total/max size
    int size;    // current size
    

    public circularQueue()
    {
        this.N = 15;
        // this.front = null;   //not needed because this is assigned by default
        // this.rear = null;
        // this.size = 0;
    }


    public circularQueue(int size)
    {
        this.N = size;
        // this.front = null;
        // this.rear = null;
        // this.size = 0;
    }


    boolean enqueue(int data) 
    {
        if (isFull()) 
        {
            return false;
        }

        Node newNode = new Node(data);

        if (isEmpty()) 
        {
            front = newNode;
            rear = newNode;
        }
        else 
        {
            rear.next = newNode;
            rear = newNode;
        }

        size++;
        rear.next = front;

        return true;
    }


    Node dequeue() 
    {
        Node removedElement = front;

        if ( !isEmpty() ) 
        {
            if (front == rear) 
            {
                front = null;
                rear = null;
            } 
            else 
            {
                front = front.next;
                rear.next = front;
            }
            size--;
        }
        return removedElement;
    }


    boolean isFull() 
    {
        return size == N;
    }


    boolean isEmpty() 
    {
        return size == 0;
    }


    public String toString() 
    {
        String toReturn = "[";
        
        if (!isEmpty()) 
        {
            Node current = front;

            while (current != rear) 
            {
                toReturn += current.data + ", ";
                current = current.next;
            }
            toReturn += rear.data;
        }
        toReturn += "]";
        
        return toReturn;
    }


    int front() 
    {
        return front.data;
    }
}
