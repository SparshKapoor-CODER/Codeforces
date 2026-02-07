import java.util.*;
public class Game{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();

            if(n%4 == 0){
                System.out.println("Bob");
            }
            else{
                System.out.println("Alice");
            }
        }
    }
}





/*
i got the logic like see let there be a number n

first let n = 4

arr = {0,1,2,3}

and they are in a set ok 

and lets think alise removes the first number visible only

so she remove 0 (a = 0)

According to the formula given 

The number b chosen by bob 

b = 4k -a + 4

There is a loop 

k = 0

while(k<n){

Get (b from the formula using k)  if such b exist in the set bob can remove it
Otherwise k++
}

If there is no such k so bob luse otherwise Alise 








But what I am not getting is how come this thing shrinks to just 
n%4 == 0

Expalin this

*/



/*

Got it 👍
You want the **same explanation**, but rewritten in **formal / research-style language** (clear, precise, no conversational tone).

Below is a **clean academic-style rewrite** while preserving the logic exactly.

---

## Abstracted Game-Theoretic Interpretation

Consider the impartial combinatorial game defined as follows. Initially, the integers
[
{0,1,2,\dots,n-1}
]
are written on a blackboard. In each round, Alice removes an integer (a). Subsequently, Bob must remove an integer (b) such that
[
a + b \equiv 3 \pmod{4}.
]
If a player is unable to make a move, that player loses.

---

## 1. Simplification of Bob’s Constraint

The condition (a + b \equiv 3 \pmod{4}) can be rewritten as
[
b \equiv 3 - a \pmod{4}.
]

Although Bob’s choice may appear to involve multiple candidates of the form
[
b = 4k - a + 4,
]
all such values differ only by multiples of 4 and therefore belong to the same residue class modulo 4.

Hence, Bob’s move is not strategic: Bob can make a move **if and only if** there exists at least one remaining number congruent to ((3-a) \bmod 4).

---

## 2. Reduction to Residue Class Counts

The exact values of the numbers are irrelevant. The game state can be fully described by the counts
[
(c_0, c_1, c_2, c_3),
]
where (c_r) denotes the number of remaining integers congruent to (r \pmod{4}).

This abstraction preserves all information relevant to the legal moves of both players.

---

## 3. Effect of a Single Round

If Alice removes a number with residue (r), then:

* (c_r) decreases by 1,
* Bob is forced to remove a number with residue ((3-r) \bmod 4), so (c_{3-r}) decreases by 1.

Thus, each round deterministically removes **one pair** from exactly one of the following residue class pairs:

* ((0,3)),
* ((1,2)).

No other transitions are possible.

---

## 4. Balanced Initial Configuration

If (n = 4k), then the initial configuration satisfies
[
c_0 = c_1 = c_2 = c_3 = k.
]

Consequently:

* The number of removable ((0,3)) pairs is (k),
* The number of removable ((1,2)) pairs is (k).

Each round removes exactly one pair, and the total number of rounds is (2k). The final move is made by Bob, leaving Alice with no legal move.

Therefore, when (n \equiv 0 \pmod{4}), the initial position is a **losing position for the first player**, and Bob wins under optimal play.

---

## 5. Imbalanced Initial Configuration

If (n \not\equiv 0 \pmod{4}), then at least one residue class has a strictly larger count than its paired class.

For example, when (n = 4k + 1):
[
c_0 = k+1, \quad c_1 = c_2 = c_3 = k.
]

In this case, Alice can exhaust all ((0,3)) pairs and then remove the remaining residue-0 element. Bob is then required to remove a residue-3 element, which no longer exists, and therefore loses immediately.

An analogous argument applies for all cases where (n \not\equiv 0 \pmod{4}).

---

## 6. Invariant and Final Conclusion

The decisive invariant of the game is the **balance of residue class pairs** ((0,3)) and ((1,2)).

* If both pairs are perfectly balanced, the position is losing for the first player.
* Any imbalance allows the first player to force a win.

Since the residue classes are balanced **if and only if** (n \equiv 0 \pmod{4}), the outcome of the game is completely determined by (n \bmod 4).

---

## Final Result

[
\boxed{
\text{Bob wins if } n \equiv 0 \pmod{4}; \quad
\text{Alice wins otherwise.}
}
]

---

If you want, I can also:

* convert this into a **formal proof structure** (Lemma → Theorem),
* express it using **P-positions and N-positions**, or
* generalize the argument to (a+b \equiv k \pmod{m}).

Just tell me.



*/