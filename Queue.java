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
            if(front.next != null)
            {
                front = front.next;
            }
            else
            {
                front = null;
                rear = null;
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






    ///////////////////////////

class circularQueue
{
    int front;
    int rear;
    int N;
    
    public circularQueue()
    {
}
    public circularQueue(int size)
    {
        this.N = size;
    }

    boolean enqueue(int v)
    {
    return true;
    }

    int dequeue()
    {
        return 0;
    }

    boolean isFull()
    {
        return true;
    }

    boolean isEmpty()
    {
        return true;
    }

    public String toString()
    {
        return "true";
    }

    int front()
    {
        return 0;
    }

}