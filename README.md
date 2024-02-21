To solve the towers of Hanoi, we can apply recursiving thinking 
by wishing that the method already exists and try to 
define it in terms of itself (recursive part).

```
Pseudo-code:

start, end, and middle are stacks of disks
n is the number of disks to move

move(start, end, middle, n){
  if(n == 1)
    // move one disk from start to end
    end.push(start.pop())
  else
    move(start, middle, end, n-1)
    // move one disk from start to end
    end.push(start.pop())
    move(middle, end, start, n-1)
}
```