![problem 1](https://github.com/jigjnasu/discrete_mathematics_and_its_applications/blob/master/chapter_9_relations/9.5_equivalence_relations/repo/problem_1.png)
#### Solution

a) $\{ (0, 0), (1, 1), (2, 2), (3, 3) \}$
| Reflexive    | Symmetric | Transitive | Equivalence | Note |
| :-: | :------: | :--: | :--: |:-- |
| yes  | yes | yes | yes | NA|

b) $\{ (0, 0), (0, 2), (2, 0), (2, 2), (2, 3), (3, 2), (3, 3) \}$
| Reflexive    | Symmetric | Transitive | Equivalence | Note |
| :-: | :------: | :--: | :--: |:--|
| no  | yes | no | no | It's not reflexive in the absence of $(1,1)$ </br> It's not transitive as well because $(0,2) \in R$ $(2,3) \in r$ but $(0,3) \notin R$ </br> $(3,2) \in R (2,0) \in R$ but $(3,0) \notin R$|

c) $\{ (0, 0), (1, 1), (1, 2), (2, 1), (2, 2), (3, 3) \}$
| Reflexive    | Symmetric | Transitive | Equivalence | Note |
| :-: | :------: | :--: | :--: |:--|
| yes  | yes | yes | yes | NA | 

d) $\{ (0, 0), (1, 1), (1, 3), (2, 2), (2, 3), (3, 1), (3, 2),(3, 3) \}$
| Reflexive    | Symmetric | Transitive | Equivalence | Note |
| :-: | :------: | :--: | :--: |:--|
| yes  | yes | no | no | It's not transitive because $(0,3) \in R$ $(3,2) \in r$ but $(1,2) \notin R$ | 

e) $\{ (0, 0), (0, 1), (0, 2), (1, 0), (1, 1), (1, 2), (2, 0),(2, 2), (3, 3) \}$
| Reflexive    | Symmetric | Transitive | Equivalence | Note |
| :-: | :------: | :--: | :--: |:--|
| yes  | no | no | no | It's not symmetric because $(1,2) \in R$ $(3,2) but $(2,1) \notin R$ </br> It's not transitive because $(2,0) \in R$ $(0,1) \in r$ but $(2,1) \notin R$ | 

![problem 2](https://github.com/jigjnasu/discrete_mathematics_and_its_applications/blob/master/chapter_9_relations/9.5_equivalence_relations/repo/problem_2.png)
#### Solution

a) { $(a,b) | a$ and $b$ are the same age }
| Reflexive    | Symmetric | Transitive | Equivalence | Note |
| :-: | :------: | :--: | :--: |:--|
| yes  | yes | yes | yes | NA | 

b) { $(a, b) | a$ and $b$ have the same parents }
| Reflexive    | Symmetric | Transitive | Equivalence | Note |
| :-: | :------: | :--: | :--: |:--|
| yes  | yes | yes | yes | NA | 

c) { $(a, b) | a$ and $b$ share a common parent }
| Reflexive    | Symmetric | Transitive | Equivalence | Note |
| :-: | :------: | :--: | :--: |:--|
| yes  | yes | no | no | $(a,b)$ have $x$ and $y$ parents but $(b, c)$ have $y$ and $z$ parents, it doesn't mean $(a, c)$ have common parents as $x$ and $z$ |

d) { $(a, b) | a$ and $b$ have met }
| Reflexive    | Symmetric | Transitive | Equivalence | Note |
| :-: | :------: | :--: | :--: |:--|
| yes  | yes | no | no | $(a, b) \in R$ and $(b, c) \n R$ but $(a, c) \notin R$ because it can be possible b and c has not met each other|

e) { $(a, b) | a$ and $b speak a common language }
| Reflexive    | Symmetric | Transitive | Equivalence | Note |
| :-: | :------: | :--: | :--: |:--|
| yes  | yes | no | no | let $(a,b)$ speaks Hindi, and $(b, c)$ speaks Tamil, it can be possible that $a$ and $c$ does not speak the same language|

![problem 3](https://github.com/jigjnasu/discrete_mathematics_and_its_applications/blob/master/chapter_9_relations/9.5_equivalence_relations/repo/problem_3.png)
#### Solution

a) { $(f, g) | f (1) = g(1)$ }
| Reflexive    | Symmetric | Transitive | Equivalence | Note |
| :-: | :------: | :--: | :--: |:--|
| yes  | yes | yes | yes | NA | 

b) { $(f, g) | f(0) = g(0)$ or $f(1) = g(1)$ }
| Reflexive    | Symmetric | Transitive | Equivalence | Note |
| :-: | :------: | :--: | :--: |:--|
| yes  | yes | no | no | This is not an equivalence relation because it is not transitive. Let $f(x) = 0$, $g(x) = x$, and $h(x) = 1$ for all $x \in Z$. Then f is related tog since $f(O) = g(O)$, and $g$ is related to $h$ since $g(l) = h(l)$, but $f$ is not related to $h$ since they have no values in common. | 

c) { $(f, g) | f(x) − g(x) = 1$ for all $x \in Z$ }
| Reflexive    | Symmetric | Transitive | Equivalence | Note |
| :-: | :------: | :--: | :--: |:--|
| no  | no | no | no | This is not reflexive as $f(x) - f(x) = 0 \ne 1$ </br> This is not symmetric because $f(x) - g(x) = 1$ but $g(x) - f(x) = -1 \ne 1$ <br> This is not transitive as $f(x) - g(x) = 1$ and $g(x) - h(x) = 1$ but $f(x) - h(x) = 2 \in 1 $| 

d) { $(f, g) |$ for some $C \in Z$, for all $x \in Z$, $f(x) − g(x) = C$ }
| Reflexive    | Symmetric | Transitive | Equivalence | Note |
| :-: | :------: | :--: | :--: |:--|
| yes  | yes | yes | yes | This is reflexive as $f(x) - f(x) = 0 = C$  </br> This is symmetric because $f(x) - g(x) = C$ and $g(x) - f(x) = -C$ <br> This is transitive as $f(x) - g(x) = C_{1}$ and $g(x) - h(x) = C_{2}$ and $f(x) - h(x) = C_{1} + C_{2} = C_{3}$| 

e) { $(f,g) | f(0) = g(1)$ and $f(1) = g(0)$ }
| Reflexive    | Symmetric | Transitive | Equivalence | Note |
| :-: | :------: | :--: | :--: |:--|
| no  | yes | no | no | This is not reflexive as $f(x) = \lambda$ where $f(0) = f(1)$  </br> This is symmetric because $f(0) = g(1)$ and $f(1) = g(0)$ <br> This is not transitive as $f(0) = g(1) = h(0) = \alpha$ and $f(1) = g(0) = g(1) = \beta$| as $\alpha \ne \beta$

![problem 4](https://github.com/jigjnasu/discrete_mathematics_and_its_applications/blob/master/chapter_9_relations/9.5_equivalence_relations/repo/problem_4.png)
#### Solution
This exercise will let us know that two students are equal on these relations.
Two students can be equivalent on these equivalence relations for example,

| S.No.    | Equivalence Relation | Class | 
| :------: | :------ | :------ |
| 1 | The day on which student is born | 1, 2, 3, ... , 31 |
| 2 | The state in which the student is born | 'Andhra Pradesh', 'Arunachal Pradesh', 'Assam', ...  |
| 3 | The CGPA in Mathematics in high school | 1, 2, 3, ... |

![problem 5](https://github.com/jigjnasu/discrete_mathematics_and_its_applications/blob/master/chapter_9_relations/9.5_equivalence_relations/repo/problem_5.png)
#### Solution
This exercise will let us know that two campus buildings are equal on these relations.
Two building can be equivalent on these equivalence relations for example,

| S.No.    | Equivalence Relation | Class | 
| :------: | :------ | :------ |
| 1 | No of stories in the building | 1 story, 2 story, 3 story, ... |
| 2 | No of science labs in the collage campus | 1, 2, 3, ... |
| 3 | minium number of CGPA required for the course | 1, 2, 3, ... |


![problem 6](https://github.com/jigjnasu/discrete_mathematics_and_its_applications/blob/master/chapter_9_relations/9.5_equivalence_relations/repo/problem_6.png)
#### Solution
This exercise will let us know that two classes are equal on these relations.
Two classes can be equivalent on these equivalence relations for example,

| S.No.    | Equivalence Relation | Class | 
| :------: | :------ | :------ |
| 1 | Department of the class | Mathematics, Computer Science, Biology, ... |
| 2 | Type of the class | Theoretical, Lab, ... |
| 3 | Location of the class | Off campus, On campus |

![problem 7](https://github.com/jigjnasu/discrete_mathematics_and_its_applications/blob/master/chapter_9_relations/9.5_equivalence_relations/repo/problem_7.png)
#### Solution

The two propositions are equivalent if their truth tables are same. </br>
Let's say we have $p$ and $q$ propositions and as they have same truth tables therefore they are reflexive in nature. </br>
As both have same truth table therefore they are symmetric as $p$ has same truth table as $q$, and $q$ has same truth table as $q$. <br>
Let's say $p , q$ and $r$ has same truth table, and we need to take one thing into consideration is that, all have same variables in their truth tables and in that case we can say they have transitive property as well. </br>
Hence two propositions are equal. Similarly. the equivalence class of F is the set of all contradictions.

![problem 8](https://github.com/jigjnasu/discrete_mathematics_and_its_applications/blob/master/chapter_9_relations/9.5_equivalence_relations/repo/problem_8.png)
#### Solution

The two sets have the same cardinality if there is a bijection (one-to-one and onto function) from one set to the other. </br>
We must show that $R$ is reflexive, symmetric, and transitive. Every set has the same cardinality as itself because of the identity function. </br>
If $f$ is a bijection from $S$ to $T$, then $f^1$ is a bijection from T to S , so R is symmetric. Finally, if f is a bijection from S to T and g
is a bijection from T to U , then g ( f is a bijection from T to U , so R is transitive (see Exercise 33 in
Section 2.3).
The equivalence class of {1, 2, 3} is the set of all three-element sets of real numbers, including such
sets as {4, 25, 1948} and {e, !,02}. Similarly, [Z] is the set of all infinite countable sets of real numbers (see
Section 2.5), such as the set of natural numbers, the set of rational numbers, and the set of the prime numbers,
but not including the set {1, 2, 3} (it’s too small) or the set of all real numbers (it’s too big). See Section 2.5
for more on countable sets.

![problem 9](https://github.com/jigjnasu/discrete_mathematics_and_its_applications/blob/master/chapter_9_relations/9.5_equivalence_relations/repo/problem_9.png)
#### Solution

a)  </br>
This relation is reflexive, since $f(x) = f(x) | x \in A$.  </br>It is symmetric as well because $f(x) = f(y)$ and $f(y) = f(x)$ | $x \in A$ and $y \in A$.</br>
It is transitive as well because $f(x) = f(y)$ and $f(y) = f(z)$ as we can say $f(x) = f(z)$ | $x \in A$, $y \in A$ and $z \in A$, therefore we can say it is transitive. </br>
And if all these properties are there on this relation $R \therefore$  we can say that R is an equivalence relation on domain $A$

b) The equivalence class of x is the set of all $y \in A$  such that $f(y) = f(x)$. This by definition means $f^{-1}(x)$

![problem 10](https://github.com/jigjnasu/discrete_mathematics_and_its_applications/blob/master/chapter_9_relations/9.5_equivalence_relations/repo/problem_10.png)
#### Solution

The function that sends each $x \n A$ to its equivalence class $[x]$ is obviously such a function. </br>
For instance, for the reflexive case, $f(x) = f(x)$ if any other case then this will always fail, even for symmetric case think $f(x) = f(y)$, other than this will fail.</br>
And because of this it is evident that $f(x) = f(y)$ is the only function which can have equivalence relation.

![problem 11](https://github.com/jigjnasu/discrete_mathematics_and_its_applications/blob/master/chapter_9_relations/9.5_equivalence_relations/repo/problem_11.png)
#### Solution

If $(x, y) \in R$ which have length more than 3 or more bit strings have first 3 bits agree on equivalence.

| Reflexive    | Symmetric | Transitive | Equivalence |
| :-: | :------: | :--: | :--: |
| yes  | yes | yes | yes |
| $(x, x) \in R$ | $(x, y) \in R$ and $(y,x) \in R$ | $(p,q) \in R$ , $(q, s) \in R$ , $(p, s) \in R$ |  |


![problem 12](https://github.com/jigjnasu/discrete_mathematics_and_its_applications/blob/master/chapter_9_relations/9.5_equivalence_relations/repo/problem_12.png)
#### Solution

| Reflexive    | Symmetric | Transitive | Equivalence |
| :-: | :------: | :--: | :--: |
| yes  | yes | yes | yes |
| $(x, x) \in R$ | $(x, y) \in R$ and $(y,x) \in R$ | $(p,q) \in R$ , $(q, s) \in R$ , $(p, s) \in R$ |  |

![problem 13](https://github.com/jigjnasu/discrete_mathematics_and_its_applications/blob/master/chapter_9_relations/9.5_equivalence_relations/repo/problem_13.png)
#### Solution

| Reflexive    | Symmetric | Transitive | Equivalence |
| :-: | :------: | :--: | :--: |
| yes  | yes | yes | yes |
| $(x, x) \in R$ | $(x, y) \in R$ and $(y,x) \in R$ | $(p,q) \in R$ , $(q, s) \in R$ , $(p, s) \in R$ |  |

![problem 14](https://github.com/jigjnasu/discrete_mathematics_and_its_applications/blob/master/chapter_9_relations/9.5_equivalence_relations/repo/problem_14.png)
#### Solution

| Reflexive    | Symmetric | Transitive | Equivalence |
| :-: | :------: | :--: | :--: |
| yes  | yes | yes | yes |
| $(x, x) \in R$ | $(x, y) \in R$ and $(y,x) \in R$ | $(p,q) \in R$ , $(q, s) \in R$ , $(p, s) \in R$ |  |

![problem 15](https://github.com/jigjnasu/discrete_mathematics_and_its_applications/blob/master/chapter_9_relations/9.5_equivalence_relations/repo/problem_15.png)
#### Solution
| Reflexive    | Symmetric | Transitive | Equivalence |
| :-: | :------: | :--: | :--: |
| yes  | yes | yes | yes |
| $(x, x) \in R$ | $(x, y) \in R$ and $(y,x) \in R$ | $(p,q) \in R$ , $(q, s) \in R$ , $(p, s) \in R$ |  |

Let's see the solution for Reflexive, Symmetric and transitive properties. </br>
##### Reflexive
1. $((a,a), (a,a)) \in R$ because $a + a = a + a$, $a = a$ </br>
2. $((a,b), (a,b)) \in R$ because $a + b = a + b$  </br> 

##### Symmetric
$(a, b), (c, d) \in R$ and $(c, d), (a, b) \in R$, it is symmetric relations. </br> 
because $a+d = b+c$ and $d+a = c+b$ both are same equations. <br>

##### Transitive
If $((a,b), (c,d)) \in R$ and $((c, d), (e,f)) \in R$ </br>
Means 
1. $a+d = b+c$ </br>
2. $c+f = d+e$ </br>
3. in equation 1, put value of $c = d+e-f$ </br>
4. $a+d = b+d+e-f$, $a = b+e-f$, $a+f = b+e$, which can be written as</br>
5. $((a, b), (e,f)) \therefore$ it is proved that, $((a, b), (e,f)) \in R$ </br>

And it is proved this is transitive, and hence it is an equivalence relation.

![problem 16](https://github.com/jigjnasu/discrete_mathematics_and_its_applications/blob/master/chapter_9_relations/9.5_equivalence_relations/repo/problem_16.png)
#### Solution

| Reflexive    | Symmetric | Transitive | Equivalence |
| :-: | :------: | :--: | :--: |
| yes  | yes | yes | yes |
| $(x, x) \in R$ | $(x, y) \in R$ and $(y,x) \in R$ | $(p,q) \in R$ , $(q, s) \in R$ , $(p, s) \in R$ |  |

Let's prove this </br>

##### Reflexive
1. $((a,a), (a,a)) \in R$ because $2a = 2a = a = a$ </br>
2. $((a,b), (a,b)) \in R$ because $ab = ab$ </br>

##### Symmetric
$((a,b), (c,d)) \in R$ and $((c,d), (a, b)) \in R$ because $ad = bc$ and $bc = ad$ both are same equations </br>

##### Transitive
1. $((a,b), (c,d)) \in R$ and $((c,d), (e,f)) \in R$
2. $ad = bc$
3. $cf = de$, put value of c from equation 2 $c = \frac{ad}{b}$ in equation 3
4. $\frac{adf}{b} = de$, $af = be$, which can also be written as $((a,b), (e,f)) \in R$
$\therefore$ it is a transitive relation.

As it is reflexive, symmetric and transitive, it is an equivalence relation.

![problem 17](https://github.com/jigjnasu/discrete_mathematics_and_its_applications/blob/master/chapter_9_relations/9.5_equivalence_relations/repo/problem_17.png)
#### Solution

| Reflexive    | Symmetric | Transitive | Equivalence |
| :-: | :------: | :--: | :--: |
| yes  | yes | yes | yes |
| $(x, x) \in R$ | $(x, y) \in R$ and $(y,x) \in R$ | $(p,q) \in R$ , $(q, s) \in R$ , $(p, s) \in R$ |  |

Given functions from $R$ to $R$, such that $(f, g) \in R$ if $f\prime(x) = g\prime(x)$ </br>

Reflexive, $(f,f) \in R$ because $f\prime(x) = f\prime(x)$</br>
Symmetric, $(f,g) \in R$ and $(g,f) \in R$ because $f\prime(x) = g\prime(x)$ and $g\prime(x) = f\prime(x)$ </br>
Transitive, $(f,g) \in R$, $(g,q) \in R$ then $(f,q) \in R$ because $f\prime(x) = g\prime(x)$, $g\prime(x) = q\prime(x)$ and $f\prime(x) = q\prime(x)$ </</br> 

B) As $f\prime(x^2) = 2x$ and $\int2x = x^2+C$. where is C is a constant and $x^2+C$ is a function in the same equivalence class.

![problem 18](https://github.com/jigjnasu/discrete_mathematics_and_its_applications/blob/master/chapter_9_relations/9.5_equivalence_relations/repo/problem_18.png)
#### Solution

| Reflexive    | Symmetric | Transitive | Equivalence |
| :-: | :------: | :--: | :--: |
| yes  | yes | yes | yes |
| $(x, x) \in R$ | $(x, y) \in R$ and $(y,x) \in R$ | $(p,q) \in R$ , $(q, s) \in R$ , $(p, s) \in R$ |  |

Given functions from $R$ to $R$, such that $(f,g) \in R$ if $f^{(n)} = g^{(n)}$, where n is the $n^{th}$ derivative </br>

Reflexive, $(f,f) \in R$ because $f^{(n)} = f^{(n)}$ </br>
Symmetric, $(f,g) \in R$ and $(g,f) \in R$ because $f^{(n)}=g^{(n)}$ and $g^{(n)} = f^{(n)}$ </br>
Transitive, $(f,g) \in R$, $(g,q) \in R$ then $(f,q) \in R$ because $f^{(n)} = g^{(n)}$, $g^{(n)} = q^{(n)}$ and $f^{(n)} = q^{(n)}$ </br> 

B) </br>
1. $f(x) = x^4$
2. $f^{(1)}(x) = 4x^3$
3. $f^{(2)}(x) = 12x^2$
4. $f^{(3)}(x) = 24x$

And </br>
1. $\int24x = 12x^2 + C_1$
2. $\int12x^2 + C_1 = 4x^3 + C_1 + C_2 = 4x^3 + C$

$4x^3 + C$ is a function in the same equivalence class.

![problem 19](https://github.com/jigjnasu/discrete_mathematics_and_its_applications/blob/master/chapter_9_relations/9.5_equivalence_relations/repo/problem_19.png)
#### Solution

| Reflexive    | Symmetric | Transitive | Equivalence |
| :-: | :------: | :--: | :--: |
| yes  | yes | yes | yes |
| $(x, x) \in R$ | $(x, y) \in R$ and $(y,x) \in R$ | $(p,q) \in R$ , $(q, s) \in R$ , $(p, s) \in R$ |  |

![problem 20](https://github.com/jigjnasu/discrete_mathematics_and_its_applications/blob/master/chapter_9_relations/9.5_equivalence_relations/repo/problem_20.png)
#### Solution

| Reflexive    | Symmetric | Transitive | Equivalence |
| :-: | :------: | :--: | :--: |
| yes  | yes | yes | yes |
| $(x, x) \in R$ | $(x, y) \in R$ and $(y,x) \in R$ | $(p,q) \in R$ , $(q, s) \in R$ , $(p, s) \in R$ |  |

![problem 21 22 23](https://github.com/jigjnasu/discrete_mathematics_and_its_applications/blob/master/chapter_9_relations/9.5_equivalence_relations/repo/problem_21_22_23.png)
#### Solution

21)</br>
| Reflexive    | Symmetric | Transitive | Equivalence |
| :-: | :------: | :--: | :--: |
| yes  | yes | no | no |

As these are the following relations</br>
$(a,a), (a,c), (a,d)$</br>
$(b,b)$</br>
$(c,a), (c,c)$</br>
$(d,a), (d,d)$</br>

##### Reflexive Yes
$(a,a), (b,b), (c,c), (d,d)$

##### Symmetric Yes
$(a,c), (c,a)$</br>
$(a,d), (d,a)$</br>

##### Transitive No
$(c,a), (a,d) \in R$ and $(a,d) \notin R$ </br>
$(d,a), (a,c) \in R$ and $(d,c) \notin R$ </br>

As it is reflexive, symmetric but not transitive, it is not an equivalence relation.

22)</br>
| Reflexive    | Symmetric | Transitive | Equivalence |
| :-: | :------: | :--: | :--: |
| yes  | yes | yes | yes |

As these are the following relations</br>
$(a,a), (a,d)$</br>
$(b,b), (b,c)$</br>
$(c,b), (c,c)$</br>
$(d,a), (d,d)$</br>

##### Reflexive Yes
$(a,a), (b,b), (c,c), (d,d)$

##### Symmetric Yes
$(a,d), (d,a) \in R$ </br>
$(b,c), (c,b) \in R$ </br>
$(c,b), (b,c) \in R$ </br>
$(d,a), (a,d) \in R$ </br>

##### Transitive Yes
$(a,a), (a,d) \in R$ and $(a,d) \in R$ </br>
$(b,b), (b,c) \in R$ and $(b,c) \in R$ </br>
$(c,b), (b,b) \in R$ and $(c,b) \in R$ </br>
$(c,b), (b,c) \in R$ and $(c,c) \in R$ </br>
$(d,a), (a,a) \in R$ and $(d,a) \in R$ </br>
$(d,a), (a,d) \in R$ and $(d,d) \in R$ </br>

As it is reflexive, symmetric and transitive therefore it is an equivalence relation.</br>
$(a,d)$ and $(a,c)$ are equivalent classes.</br></br>

23)</br>
| Reflexive    | Symmetric | Transitive | Equivalence |
| :-: | :------: | :--: | :--: |
| yes  | yes | no | no |

As these are the following relations</br>
$(a,a), (a,b), (a,d)$</br>
$(b,a), (b,b), (b,c)$</br>
$(c,b), (c,c), (c,d)$</br>
$(d,a), (d,c), (d,d)$</br>

##### Reflexive Yes
$(a,a), (b,b), (c,c), (d,d)$

##### Symmetric Yes
$(a,b), (b,c) \in R$ and $(a,d), (d,a) \in R$</br>
$(b,a), (a,b) \in R$ and $(b,c), (c,b) \in R$</br>
$(c,b), (b,c) \in R$ and $(c,d), (d,c) \in R$</br>
$(d,a), (a,d) \in R$ and $(d,c), (c,d) \in R$</br>


##### Transitive No
$(a,b), (b,c) \in R$ and $(a,c) \notin R$ </br>
$(b,a), (a,d) \in R$ and $(b,d) \notin R$ </br>
$(c,b), (b,a) \in R$ and $(c,a) \notin R$ </br>
$(d,a), (a,b) \in R$ and $(d,b) \notin R$ </br>

As it is reflexive, symmetric but not transitive, it is not an equivalence relation.</br></br>

![problem 24](https://github.com/jigjnasu/discrete_mathematics_and_its_applications/blob/master/chapter_9_relations/9.5_equivalence_relations/repo/problem_24.png)
#### Solution

a)</br>
| Reflexive    | Symmetric | Transitive | Equivalence |
| :-: | :------: | :--: | :--: |
| yes  | no | no | no |

As these are the following relations</br>
$(a,a), (a,b), (a,c)$</br>
$(b,b), (b,c)$</br>
$(c,a), (c,b), (c,c)$</br>

##### Reflexive Yes
$(a,a), (b,b), (c,c)$

##### Symmetric No
$(a,b) \in R$ and $(b,a) \notin R$


##### Transitive No
$(b,c), (c,a) \in R$ and $(b,a) \notin R$ </br>

As it is reflexive but not symmetric and transitive, it is not an equivalence relation.</br></br>


b)</br>
| Reflexive    | Symmetric | Transitive | Equivalence |
| :-: | :------: | :--: | :--: |
| yes  | yes | yes | yes |

As these are the following relations</br>
$(a,a), (a,c)$</br>
$(b,b), (b,d)$</br>
$(c,a), (c,c)$</br>
$(d,b), (d,d)$</br>

##### Reflexive Yes
$(a,a), (b,b), (c,c), (d,d)$

##### Symmetric Yes
$(a,c), (c,a) \in R$</br>
$(b,d), (d,b) \in R$</br>
$(c,a), (a,c) \in R$</br>
$(d,b), (b,d) \in R$</br>

##### Transitive Yes
$(a,a), (a,c) \in R$ and $(a,c) \in R$ </br>
$(a,c), (c,a) \in R$ and $(a,a) \in R$ </br>
$(a,c), (c,c) \in R$ and $(a,c) \in R$ </br>
$(b,b), (b,d) \in R$ and $(b,d) \in R$ </br>
$(b,d), (d,b) \in R$ and $(b,b) \in R$ </br>
$(b,d), (d,d) \in R$ and $(b,d) \in R$ </br>
$(c,a), (c,c) \in R$ and $(c,c) \in R$ </br>
$(c,a), (a,a) \in R$ and $(c,a) \in R$ </br>
$(c,a), (a,c) \in R$ and $(c,c) \in R$ </br>
$(d,b), (b,b) \in R$ and $(d,b) \in R$ </br>
$(d,b), (b,d) \in R$ and $(d,d) \in R$ </br>
$(d,d), (d,b) \in R$ and $(d,b) \in R$ </br>

As it is reflexive, symmetric and transitive, it is an equivalence relation.</br>
$(a,c)$ and $(b,d)$ are equivalent classes.</br></br>

c)</br>
| Reflexive    | Symmetric | Transitive | Equivalence |
| :-: | :------: | :--: | :--: |
| yes  | yes | yes | yes |

As these are the following relations</br>
$(a,a), (a,b), (a,c)$</br>
$(b,a), (b,b), (b,c)$</br>
$(c,a), (c,b), (c,c)$</br>
$((d,d)$</br>

##### Reflexive Yes
$(a,a), (b,b), (c,c), (d,d)$

##### Symmetric Yes
$(a,b), (b,a) \in R$ and $(a,c), (c,a) \in R$</br>
$(b,a), (a,b) \in R$ and $(b,c), (c,b) \in R$</br>
$(c,a), (a,c) \in R$ and $(c,b), (b,c) \in R$</br>

##### Transitive Yes
$(a,a), (a,b) \in R$ and $(a,b) \in R$ </br>
$(a,a), (a,c) \in R$ and $(a,c) \in R$ </br>
$(a,b), (b,a) \in R$ and $(a,a) \in R$ </br>
$(a,b), (b,b) \in R$ and $(a,b) \in R$ </br>
$(a,b), (b,c) \in R$ and $(a,c) \in R$ </br>
$(a,c), (c,a) \in R$ and $(a,a) \in R$ </br>
$(a,c), (c,b) \in R$ and $(a,b) \in R$ </br>
$(a,c), (c,c) \in R$ and $(a,c) \in R$ </br>
</br>
$(b,a), (a,a) \in R$ and $(b,a) \in R$ </br>
$(b,a), (a,b) \in R$ and $(b,b) \in R$ </br>
$(b,a), (a,c) \in R$ and $(b,c) \in R$ </br>
$(b,b), (b,a) \in R$ and $(b,a) \in R$ </br>
$(b,b), (b,c) \in R$ and $(b,c) \in R$ </br>
$(b,c), (c,a) \in R$ and $(b,a) \in R$ </br>
$(b,c), (c,b) \in R$ and $(b,b) \in R$ </br>
$(b,c), (b,c) \in R$ and $(b,c) \in R$ </br>
</br>
$(c,a), (a,a) \in R$ and $(c,a) \in R$ </br>
$(c,a), (a,b) \in R$ and $(c,b) \in R$ </br>
$(c,a), (a,c) \in R$ and $(c,c) \in R$ </br>
$(c,b), (b,a) \in R$ and $(c,a) \in R$ </br>
$(c,b), (b,b) \in R$ and $(c,b) \in R$ </br>
$(c,b), (b,c) \in R$ and $(c,c) \in R$ </br>
$(c,c), (c,a) \in R$ and $(c,a) \in R$ </br>
$(c,c), (c,b) \in R$ and $(c,b) \in R$ </br>

As it is reflexive, symmetric and transitive, it is an equivalence relation.</br>
$(a,b, c)$ and $d$ are equivalent classes.</br></br>

![problem 25](https://github.com/jigjnasu/discrete_mathematics_and_its_applications/blob/master/chapter_9_relations/9.5_equivalence_relations/repo/problem_25.png)
#### Solution

| Reflexive    | Symmetric | Transitive | Equivalence |
| :-: | :------: | :--: | :--: |
| yes  | yes | yes | yes |

Let's the function $f(s)$ = number of $1^s$ in bit string $s$ </br>

##### Reflexive Yes
$(s,s) \in R$

##### Symmetric Yes
$(s,t), (t,s) \in R$ </br>
because $f(s) = f(t)$ </br>

##### Transitive Yes
$(s,t), (t,p) \in R$ and $(s,p) \in R$ </br>
because $f(s) = f(t) = f(p)$

As it is reflexive, symmetric and transitive, it is an equivalence relation.</br>

![problem 26](https://github.com/jigjnasu/discrete_mathematics_and_its_applications/blob/master/chapter_9_relations/9.5_equivalence_relations/repo/problem_26.png)
#### Solution

a) $\{ (0, 0), (1, 1), (2, 2), (3, 3) \}$
| Reflexive    | Symmetric | Transitive | Equivalence | Equivalence Classes | Note |
| :-: | :------: | :--: | :--: | :--: |:-- |
| yes  | yes | yes | yes | 0, 1, 2 | NA|
</br>

b) $\{ (0, 0), (0, 2), (2, 0), (2, 2), (2, 3), (3, 2), (3, 3) \}$
| Reflexive    | Symmetric | Transitive | Equivalence | Equivalence Classes | Note |
| :-: | :------: | :--: | :--: | :--: |:--|
| no  | yes | no | no | NA | It's not reflexive in the absence of $(1,1)$ </br> It's not transitive as well because $(0,2) \in R$ $(2,3) \in r$ but $(0,3) \notin R$ </br> $(3,2) \in R (2,0) \in R$ but $(3,0) \notin R$|

c) $\{ (0, 0), (1, 1), (1, 2), (2, 1), (2, 2), (3, 3) \}$
| Reflexive    | Symmetric | Transitive | Equivalence | Equivalence Classes | Note |
| :-: | :------: | :--: | :--: | :--: |:--|
| yes  | yes | yes | yes | 0, (1,2), 3 | NA | 

d) $\{ (0, 0), (1, 1), (1, 3), (2, 2), (2, 3), (3, 1), (3, 2),(3, 3) \}$
| Reflexive    | Symmetric | Transitive | Equivalence | Equivalence Classes | Note |
| :-: | :------: | :--: | :--: | :--: |:--|
| yes  | yes | no | no | NA | It's not transitive because $(0,3) \in R$ $(3,2) \in r$ but $(1,2) \notin R$ | 

e) $\{ (0, 0), (0, 1), (0, 2), (1, 0), (1, 1), (1, 2), (2, 0),(2, 2), (3, 3) \}$
| Reflexive    | Symmetric | Transitive | Equivalence | Equivalence Classes | Note |
| :-: | :------: | :--: | :--: | :--: |:--|
| yes  | no | no | no | NA | It's not symmetric because $(1,2) \in R$ $(3,2) but $(2,1) \notin R$ </br> It's not transitive because $(2,0) \in R$ $(0,1) \in r$ but $(2,1) \notin R$ | 

![problem 27](https://github.com/jigjnasu/discrete_mathematics_and_its_applications/blob/master/chapter_9_relations/9.5_equivalence_relations/repo/problem_27.png)
#### Solution

a) { $(a,b) | a$ and $b$ are the same age }
| Reflexive    | Symmetric | Transitive | Equivalence | Equivalence Classes | Note |
| :-: | :------: | :--: | :--: | :--: |:--|
| yes  | yes | yes | yes | all the same age people, for example all of the age of 25 |  NA |

b) { $(a, b) | a$ and $b$ have the same parents }
| Reflexive    | Symmetric | Transitive | Equivalence | Equivalence Classes | Note |
| :-: | :------: | :--: | :--: | :--: |:--|
| yes  | yes | yes | yes | all the siblings, or all the children of a parents | NA  |

c) { $(a, b) | a$ and $b$ share a common parent }
| Reflexive    | Symmetric | Transitive | Equivalence | Equivalence Classes | Note |
| :-: | :------: | :--: | :--: | :--: |:--|
| yes  | yes | no | no | NA | $(a,b)$ have $x$ and $y$ parents but $(b, c)$ have $y$ and $z$ parents, it doesn't mean $(a, c)$ have common parents as $x$ and $z$ |

d) { $(a, b) | a$ and $b$ have met }
| Reflexive    | Symmetric | Transitive | Equivalence | Equivalence Classes | Note |
| :-: | :------: | :--: | :--: | :--: |:--|
| yes  | yes | no | no | NA | $(a, b) \in R$ and $(b, c) \n R$ but $(a, c) \notin R$ because it can be possible b and c has not met each other|

e) { $(a, b) | a$ and $b speak a common language }
| Reflexive    | Symmetric | Transitive | Equivalence | Equivalence Classes | Note |
| :-: | :------: | :--: | :--: | :--: |:--|
| yes  | yes | no | no | NA | let $(a,b)$ speaks Hindi, and $(b, c)$ speaks Tamil, it can be possible that $a$ and $c$ does not speak the same language|

![problem 28](https://github.com/jigjnasu/discrete_mathematics_and_its_applications/blob/master/chapter_9_relations/9.5_equivalence_relations/repo/problem_28.png)
#### Solution

a) { $(f, g) | f (1) = g(1)$ }
| Reflexive    | Symmetric | Transitive | Equivalence | Equivalence Classes | Note |
| :-: | :------: | :--: | :--: | :--: |:--|
| yes  | yes | yes | yes | n is a Integer where n = 1 | NA | 

b) { $(f, g) | f(0) = g(0)$ or $f(1) = g(1)$ }
| Reflexive    | Symmetric | Transitive | Equivalence | Equivalence Classes | Note |
| :-: | :------: | :--: | :--: | :--: |:--|
| yes  | yes | no | no | NA | This is not an equivalence relation because it is not transitive. Let $f(x) = 0$, $g(x) = x$, and $h(x) = 1$ for all $x \in Z$. Then f is related tog since $f(O) = g(O)$, and $g$ is related to $h$ since $g(l) = h(l)$, but $f$ is not related to $h$ since they have no values in common. | 

c) { $(f, g) | f(x) − g(x) = 1$ for all $x \in \mathbb{Z}$ } </br>
| Reflexive    | Symmetric | Transitive | Equivalence | Equivalence Classes | Note |
| :-: | :------: | :--: | :--: | :--: |:--|
| no  | no | no | no | NA | This is not reflexive as $f(x) - f(x) = 0 \ne 1$ </br> This is not symmetric because $f(x) - g(x) = 1$ but $g(x) - f(x) = -1 \ne 1$ <br> This is not transitive as $f(x) - g(x) = 1$ and $g(x) - h(x) = 1$ but $f(x) - h(x) = 2 \in 1$ | 

d) { $(f, g) |$ for some $C \in \mathbb{Z}$, for all $x \in \mathbb{Z}$, $f(x) − g(x) = C$ }
| Reflexive    | Symmetric | Transitive | Equivalence | Equivalence Classes | Note |
| :-: | :------: | :--: | :--: | :--: |:--|
| yes  | yes | yes | yes | Here we have many equivalence classes  | This is reflexive as $f(x) - f(x) = 0 = C$  </br> This is symmetric because $f(x) - g(x) = C$ and $g(x) - f(x) = -C$ <br> This is transitive as $f(x) - g(x) = C_{1}$ and $g(x) - h(x) = C_{2}$ and $f(x) - h(x) = C_{1} + C_{2} = C_{3}$| 

e) { $(f,g) | f(0) = g(1)$ and $f(1) = g(0)$ }
| Reflexive    | Symmetric | Transitive | Equivalence | Equivalence Classes | Note |
| :-: | :------: | :--: | :--: | :--: |:--|
| no  | yes | no | no | This is not reflexive as $f(x) = \lambda$ where $f(0) = f(1)$  </br> This is symmetric because $f(0) = g(1)$ and $f(1) = g(0)$ <br> This is not transitive as $f(0) = g(1) = h(0) = \alpha$ and $f(1) = g(0) = g(1) = \beta$| as $\alpha \ne \beta$ |

![problem 29](https://github.com/jigjnasu/discrete_mathematics_and_its_applications/blob/master/chapter_9_relations/9.5_equivalence_relations/repo/problem_29.png)
#### Solution

The equivalence classes for this solution are many. </br>
One of the example as follows:-- </br>
For $11$ the solution can be $011, 101, 110, 0011, 0101, 1010, 1100, 0110,...$ etc

![problem 30](https://github.com/jigjnasu/discrete_mathematics_and_its_applications/blob/master/chapter_9_relations/9.5_equivalence_relations/repo/problem_30.png)
#### Solution

Following are the equivalence classes :--

a) </br>
all bit strings whose bit strings starts with $010$. </br>
$010$ = $010, 0100, 0101, 01000, 01001, 01010, 01011, 010000, 010001, ...$ </br>

b) </br>
all bit strings whose bit strings starts with $1011$. </br>
$1011$ = $1011, 10110, 10111, 101100, 101101, 101110, 101111, 1011000, 1011001, ...$ </br>

c) </br>
all bit strings whose bit strings starts with $11111$. </br>
$11111$ = $11111, 111110, 111111, 1111100, 1111101, 1111110, 1111111, 11111000, 11111001, ...$ </br>

d) </br>
all bit strings whose bit strings starts with $01010101$. </br>
$01010101$ = $01010101, 010101010, 010101011, 0101010100, 0101010101, 0101010110, 0101010111, 01010101000, 01010101001, ...$ </br>

![problem 31](https://github.com/jigjnasu/discrete_mathematics_and_its_applications/blob/master/chapter_9_relations/9.5_equivalence_relations/repo/problem_31.png)
#### Solution

For two bit strings to be equivalent where first three bits can be anything and after that all bit strings has to be equivalent. </br>

For instance $xyzt$ and $x\prime y\prime z\prime t$, where $xyz$ and $x\prime y\prime z\prime$ can be any bits and $t$ bit strings are equivalent. </br>

a) 3 length of any two bit strings are equivalent classes. </br>
b) $xyz1$ and $x\prime y\prime z\prime1$, where $xyz$ and $x\prime y\prime z\prime$ can be any bits. </br>
c) $xyz11$ and $x\prime y\prime z\prime11$, where $xyz$ and $x\prime y\prime z\prime$ can be any bits. </br>
d) $xyz10101$ and $x\prime y\prime z\prime10101$, where $xyz$ and $x\prime y\prime z\prime$ can be any bits. </br>

![problem 32](https://github.com/jigjnasu/discrete_mathematics_and_its_applications/blob/master/chapter_9_relations/9.5_equivalence_relations/repo/problem_32.png)
#### Solution

For two bit strings to be equivalent where first and third bits to be equivalent where length is 3 or more. </br>

For instance $xyzt$ and $x y\prime z t\prime$, where $y$ and $y\prime$ can be any bits and $t$ and $t\prime$ can be any bit strings. </br>

a) all bit strings starts with $000$ or $010$. </br>
b) all bit strings starts with $101$ or $111$. </br>
c) all bit strings starts with $101$ or $111$. </br>
d) all bit strings starts with $000$ or $010$. </br> 

![problem 33](https://github.com/jigjnasu/discrete_mathematics_and_its_applications/blob/master/chapter_9_relations/9.5_equivalence_relations/repo/problem_33.png)
#### Solution

Two bit strings have $R_4$ equivalence when first 4 bits are equivalent. </br>

a) As the length of the bit string is less than 4, $010$ bit string is equivalent. </br>
b) all the strings starting with $1011$ are equivalent. </br>
c) all the strings starting with $1111$ are equivalent. </br>
d) all the strings starting with $0101$ are equivalent. </br>

![problem 34](https://github.com/jigjnasu/discrete_mathematics_and_its_applications/blob/master/chapter_9_relations/9.5_equivalence_relations/repo/problem_34.png)
#### Solution

Two bit strings have $R_5$ equivalence when first 5 bits are equivalent. </br>

a) As the length of the bit string is less than 5, $010$ bit string is equivalent. </br>
b) As the length of the bit string is less than 5, $1011$ bit string is equivalent. </br>
c) all the strings starting with $11111$ are equivalent. </br>
d) all the strings starting with $01010$ are equivalent. </br>

![problem 35](https://github.com/jigjnasu/discrete_mathematics_and_its_applications/blob/master/chapter_9_relations/9.5_equivalence_relations/repo/problem_35.png)
#### Solution

$[n]_{5}$ = $\{i| i = n (mod \space 5) \}$ </br>

a) 2 ? </br>
$[2]_{5}$ = $\{i| i = 2 (mod \space 5) \}$ = $\{ ..., -13, -8, -3, 2, 7, 12, 17, ... \}$</br>

b) 3 ? </br>
$[3]_{5}$ = $\{i| i = 3 (mod \space 5) \}$ = $\{ ..., -12, -7, -2, 3, 8, 13, 18, ... \}$</br>

c) 6 ? </br>
$[6]_{5}$ = $\{i| i = 6 (mod \space 5) \}$ = $\{ ..., -14, -9, -4, 1, 6, 11, 16, ... \}$</br>

d) -3 ? </br>
$[-3]_{5}$ = $\{i| i = -3 (mod \space 5) \}$ = $\{ ..., -13, -8, -3, 2, 7, 12, 17, ... \}$</br>

![problem 36](https://github.com/jigjnasu/discrete_mathematics_and_its_applications/blob/master/chapter_9_relations/9.5_equivalence_relations/repo/problem_36.png)
#### Solution

$[4]_{m}$ = $\{i| i = 4 (mod \space m) \}$ </br>

a) 2 ? </br>
$[4]_{2}$ = $\{i| i = 4 (mod \space 2) \}$ = $\{ ..., -6, -4, -2, 0, 2, 4, 6, 8, ... \}$</br>

b) 3 ? </br>
$[4]_{3}$ = $\{i| i = 3 (mod \space 5) \}$ = $\{ ...,-8, -5, -2, 1, 4, 7, 10, ... \}$</br>

c) 6 ? </br>
$[4]_{6}$ = $\{i| i = 6 (mod \space 5) \}$ = $\{ ..., -14, -8, -2, 4, 10, 16, 22, ... \}$</br>

d) 8 ? </br>
$[4]_{8}$ = $\{i| i = -3 (mod \space 5) \}$ = $\{ ..., -28 , -20, -12, -4, 4, 12, 20, 28, ... \}$</br>

![problem 37](https://github.com/jigjnasu/discrete_mathematics_and_its_applications/blob/master/chapter_9_relations/9.5_equivalence_relations/repo/problem_37.png)
#### Solution

$[i]_{6}$ = $\{ i = 0, 1, 2, 3, 4, 5 \}$ </br>
$[[i]_{6}]_{i=0}^5$ = $[ik + 6]_{i=0}^5 | k \in Z$</br>

$[0]_6$ = $...,-18, -12, -6,  0, 6,  12,  18, ...$ </br>
$[1]_6$ = $...,-17, -11, -5,  1, 7,  13,  19, ...$ </br>
$[2]_6$ = $...,-16, -10, -4,  2, 8,  14,  20, ...$ </br>
$[3]_6$ = $...,-15, -9,  -3,  3, 9,  15,  21, ...$ </br>
$[4]_6$ = $...,-14, -8,  -2,  4, 10, 16,  22, ...$ </br>
$[5]_6$ = $...,-13, -7,  -1,  5, 11, 17,  23, ...$ </br>

![problem 38](https://github.com/jigjnasu/discrete_mathematics_and_its_applications/blob/master/chapter_9_relations/9.5_equivalence_relations/repo/problem_38.png)
#### Solution

a) No </br>
$no, nO, No, NO$ </br>

b) Yes </br>
$yes, yeS, yEs, yES, Yes, YeS, YEs, YES$ </br>

c) Help </br>
$help, helP, heLp, heLP, hElp, hElP, hELp, hELP, Help, HelP, HeLp, HeLP, HElp, HElP, HELp, HELP$ </br>

![problem 39](https://github.com/jigjnasu/discrete_mathematics_and_its_applications/blob/master/chapter_9_relations/9.5_equivalence_relations/repo/problem_39.png)
#### Solution

a) </br>
According to exercise 15 $((a,b), (c,d)) \in R$ if $a + d = b + c$ </br>
$a + d = b + c$ => $a - b = c - d$ => $1 - 2 = c - d$ => $-1 = c - d$ </br>

$\therefore$ the equivalence classes for $(c,d)$ = $\{..., (-3-,2), (-2,-1), (0, 1), (1, 2), (2, 3), (3,4), ... \}$

b) </br>
As the equivalence class is $(1, 2), \{..., (-3-,2), (-2,-1), (0, 1), (1, 2), (2, 3), (3,4), ... \}$ </br>
In this case $c-d$ can be negative, positive, which is a definition of an Integer, and $\therefore$ this represents $\mathbb{Z}$ </br>

![problem 40](https://github.com/jigjnasu/discrete_mathematics_and_its_applications/blob/master/chapter_9_relations/9.5_equivalence_relations/repo/problem_40.png)
#### Solution

a) </br>
According to exercise 16 $((a,b), (c,d)) \in R$ if $ad = bc$ </br>
$ad = bc$ => $1d = 2c$ => $\frac{1}{2} = \frac{c}{d}$ </br>

$\therefore$ the equivalence classes for $(c,d)$ = $\lbrace..., \frac{-3}{-6}, \frac{-2}{-4}, \frac{2}{4}, \frac{3}{6}, ...\rbrace$ etc, any fraction which comes out as $\frac{1}{2}$ is the solution.

b)In this case $\frac{c}{d}$ can be both positive or both negative therefore fraction should represents $\mathbb{Z}$

![problem 41](https://github.com/jigjnasu/discrete_mathematics_and_its_applications/blob/master/chapter_9_relations/9.5_equivalence_relations/repo/problem_41.png)
#### Solution

| problem    | partition | Note |
| :-: | :------: | :--: |
|  a  |    No    | Sets are not disjoint as 2 and 4 are in two sets |
|  b  |   Yes    |  NA  |
|  c  |   Yes    |  NA  |
|  d  |    No    |  Union of sets does not include 3 |

![problem 42](https://github.com/jigjnasu/discrete_mathematics_and_its_applications/blob/master/chapter_9_relations/9.5_equivalence_relations/repo/problem_42.png)
#### Solution

| problem    | partition | Note |
| :-: | :------: | :--: |
|  a  |   Yes    |  NA  |
|  b  |    No    |  Sets are not disjoint as 0 is in two sets  |
|  c  |   Yes    |  NA  |
|  d  |    No    |  Union of sets does not include 0 |

![problem 43](https://github.com/jigjnasu/discrete_mathematics_and_its_applications/blob/master/chapter_9_relations/9.5_equivalence_relations/repo/problem_43.png)
#### Solution

| problem    | partition | Note |
| :-: | :------: | :--: |
|  a  |   Yes    |  all the bit strings will start from 0 or 1, the cases can be 00, 01, 10, 11  |
|  b  |    No    |  as the bit string 00000001 or 10010000 contains 00, 01 in first case and 10, 00, 01 in second case  |
|  c  |   Yes    |  as the bit string will end in 00, 01, 10, 11  |
|  d  |    No    |  as the bit string can end in 0 or 1, 00, 01, 10, 11, the 01, 10 case is missing |
|  e  |   Yes    |  as the bit string can have 0, 1, 2, 3, 4, 5, 6, 7, 8 ones, for 0, 1, 2 k = 0, and for  3, 4 ,5, k = 2, and for 6,7,8 k = 2 and ones will satisfy 3k, 3k+1 and 3k+2 in every case |
</br>

![problem 44 a](https://github.com/jigjnasu/discrete_mathematics_and_its_applications/blob/master/chapter_9_relations/9.5_equivalence_relations/repo/problem_44_a.png)
</br>
![problem 44 b](https://github.com/jigjnasu/discrete_mathematics_and_its_applications/blob/master/chapter_9_relations/9.5_equivalence_relations/repo/problem_44_b.png)
#### Solution

a) **YES** </br>
$s1 = {-\infty, ..., -4, -2, 0, 2, 4, ..., \infty }$ </br>
$s2 = {-\infty, ..., -3, -1, 1, 3, 5, ..., \infty }$ </br>
As the union of both the sets make entire $\mathbb{Z} \therefore$ it is a valid partition. </br>

b) **NO** </br>
$s1 = {-\infty, ..., -5, -4, -3, -2, -1}$ </br>
$s2 = {1, 2, 3, 4, 5, ..., \infty }$ </br>
As $0$ is missing in both the sets $\therefore$ it is not a valid partition of $\mathbb{Z}$. </br>

c) **YES** </br>
$s1 = -\infty, ..., -6, -3, 0, 3, 6, ..., \infty$ </br>
$s2 = -\infty, ..., -5, -2, 1, 4, 7, ..., \infty$ </br>
$s3 = -\infty, ..., -4, -1, 2, 5, 8, ..., \infty$ </br>
As union of all three sets is a $\mathbb{Z} \therefore$ it is a valid partition. </br> 

d) **YES** </br>
$s1 = -\infty, ..., -103, -102, -101$ </br>
$s2 = -100, -99, -98, ..., 0, ..., 98, 99, 100$ </br>
$s3 = 101, 102, 103, ..., \infty$ </br>
As union of all three sets is a $\mathbb{Z} \therefore$ it is a valid partition. </br> 

e) **NO** </br>
$s1 = -\infty, ..., -5, -4, -2, -1, 1, 2, 4, 5, ..., \infty$ </br>
$s2 = -\infty, ..., -8, -6, -4, -2, 0, 2, 4, 6, 8, ..., \infty$ </br>
$s3 = -\infty, ...-9, -3, 3, 9, 15, ..., \infty$ </br>
As there is repetition of even numbers in $s1, s2$ like $-4, -2, 2, 4$ etc.
$\therefore$ it is not a valid partition. </br>

![problem 45](https://github.com/jigjnasu/discrete_mathematics_and_its_applications/blob/master/chapter_9_relations/9.5_equivalence_relations/repo/problem_45.png)
#### Solution

a) **NO** </br>
| set    | condition | examples |
| :----: | :--------:| :------: |
|  (x,y) | x or y is odd | (1,2), (2,1) |
|  (x,y) | x is even | (2, 1) |
|  (x,y) | y is even | (1,2) |

As we can see here pairs are not pairwise disjoint like $(1,2)$ in set 1 and 3, and $(2,1)$ in 1 and 2. </br>

b) **YES** </br>
| set    | condition | examples |
| :----: | :--------:| :------: |
|  (x,y) | both x and y are odd | (-1, -3), (1, 3), (3, 1), (3, 3) |
|  (x,y) | exactly one of x and y is odd | (1, 2), (2, 1), (-1, -2) |
|  (x,y) | both x and y are even | (2,4), (-2, -4), (2, 6) |

As we can see all pairs are pairwise disjoint, non empty and make $\mathbb{Z} X \mathbb{Z}$ ordered pairs and therefore it is a valid partition.

c) **NO** </br>
| set    | condition | examples |
| :----: | :--------:| :------: |
|  (x,y) | x is positive | (1, 2) |
|  (x,y) | y is positive | (1, 2) |
|  (x,y) | both x and y are negative | (-1, -1), (-1, -3) |

As in set 1 and set 2 $(1,2)$ are presents, it is not a pairwise disjoint. </br>
As $(0, 0)$ is not in the set therefore sets union is not $\mathbb{Z} X \mathbb{Z}$

d) **YES** </br>
| set    | condition | examples |
| :----: | :--------:| :------: |
|  (x,y) | where x divides by 3 y divides by 3 | (-3, 0), (0, 0), (3, 3), (6, 6) |
|  (x,y) | where x divides by 3 y not divides by 3 | (3, 2), (-3, 4) |
|  (x,y) | where x not divides by 3 y divides by 3 | (-1, 3), (4, 9) |
|  (x,y) | where x not divides by 3 y not divides by 3 | (-1, -1), (2, 4), (7, 8) |

As all pairs are pairwise disjoint, non empty and union makes $\mathbb{Z} X \mathbb{Z}$ therefore its a valid partition. </br>

e) **YES** </br>
| set    | condition | examples |
| :----: | :--------:| :------: |
|  (x,y) | $x > 0$  and $y > 0$  | (1, 1), (1, 2), (3, 1) |
|  (x,y) | $x > 0$  and $y \le 0$ | (1, 0), (1, -1), (2, -2) |
|  (x,y) | $x \le 0$ and $y > 0$  | (0, 1), (-1, 2), (-3, 9) |
|  (x,y) | $x \le 0$ and $y \le 0$ | (0, 0), (0, -1), (-1, 0) |

As all pairs are pairwise disjoint, non empty and union makes $\mathbb{Z} X \mathbb{Z}$ therefore its a valid partition. </br>

f) **NO** </br>
| set    | condition | examples |
| :----: | :--------:| :------: |
|  (x,y) | $x \ne 0$ and y $\ne$ 0 | (-1, 1), (1, 2), (2, -1) |
|  (x,y) | $x = 0$  and $y \ne 0$ | (0, 1), (0, -1), (0, -2) |
|  (x,y) | $x \ne 0$ and $y = 0$  | (1, 0), (-1, 0), (-3, 0) |

As the union of all sets doest make $\mathbb{Z} X \mathbb{Z}$, where $(0, 0)$ is missing. </br>

![problem 46](https://github.com/jigjnasu/discrete_mathematics_and_its_applications/blob/master/chapter_9_relations/9.5_equivalence_relations/repo/problem_46.png)
#### Solution

By definition a valid partition set is when it is nonempty, disjoints and union of it makes the set. </br>

a) **YES** as it matches the definition </br>
b) **YES** as it matches the definition </br>
c) **NO** because of closed brackets, it is not pairwise disjoint, as they will share the endpoints </br>
d) **NO** because the union of it will not have integers </br>
e) **YES** as it matches the definition </br>
f) **YES** as matches the definition. Each equivalence class consists of all real numbers with a fixed fractional part. </br>

![problem 47](https://github.com/jigjnasu/discrete_mathematics_and_its_applications/blob/master/chapter_9_relations/9.5_equivalence_relations/repo/problem_47.png)
#### Solution

a) </br>
$\{(0,0), (1, 1), (1, 2), (2, 1), (2, 2),(3, 3), (3, 4), (3, 5), (4, 3), (4, 4), (4, 5),(5, 3), (5, 4), (5, 5) \}$ </br>

b) </br>
$\{(0, 0), (0, 1), (1, 0), (1, 1),(2, 2), (2, 3), (3, 2), (3, 3),(4, 4), (4, 5), (5, 4), (5, 5)\}$

c) </br>
$\{(0, 0), (0, 1), (0, 2), (1, 0), (1, 1), (1, 2), (2, 0), (2, 1), (2, 2),(3, 3), (3, 4), (3, 5), (4, 3), (4, 4), (4, 5), (5, 3), (5, 4), (5, 5)\}$

d) </br>
$\{(0,0),(1, 1),(2, 2),(3, 3),(4, 4),(5, 5)\}$</br>

![problem 48 a](https://github.com/jigjnasu/discrete_mathematics_and_its_applications/blob/master/chapter_9_relations/9.5_equivalence_relations/repo/problem_48_a.png)
</br>
![problem 48 b](https://github.com/jigjnasu/discrete_mathematics_and_its_applications/blob/master/chapter_9_relations/9.5_equivalence_relations/repo/problem_48_b.png)
#### Solution

a) </br>
$\{(a,a), (a,b), (b,a), (b,b), (c,c), (c,d), (d,c), (d,d), (e,e), (e,f), (e,g), (f,e), (f,f), (f,g), (g,e), (g,f),(g,g)\}$</br>

b) </br>
$\{(a,a),(b,b), (c,c), (c,d), (d,c), (d,d), (e,e), (e,f), (f,e), (f,f), (g,g)\}$</br>

c) </br>
$\{(a,a), (a,b), (a,c), (a,d),(b,a), (b,b), (b,c), (b,d),(c,a), (c,b), (c,c), (c,d),(d,a), (d,b), (d,c), (d,d), (e,e), (e,f), (e,g),(f,e), (f,f), (f,g),(g,e), (g,f), (g,g)\}$</br>

d) </br>
$\{(a,a),(a,c),(a,e),(a,g),(c,a),(c,c),(c,e),(c,g),(e,a),(e,c),(e,e),(e,g),(g,a),(g,c),(g,e),(g,g),(b,b),(b,d),(d,b),(d,d),(f,f)\}$ </br>

![problem 49](https://github.com/jigjnasu/discrete_mathematics_and_its_applications/blob/master/chapter_9_relations/9.5_equivalence_relations/repo/problem_49.png)
#### Solution

For this solution, we need to show that every equivalence class modulo 6 is contained in an equivalence class modulo 3. </br>
For each $n \in \mathbb{Z}$, where $[n]_6 = [n]_3$. </br>
If $m = n (mod \space 6)$ means $m - n$ is a multiple of 6 </br>
In the same way $m - n$ is a multiple of 3, because $6 = 3 X 2$.
And therefore it shows that $[n]_6 = [n]_3$.

![problem 50](https://github.com/jigjnasu/discrete_mathematics_and_its_applications/blob/master/chapter_9_relations/9.5_equivalence_relations/repo/problem_50.png)
#### Solution

For this solution, we need to show that every equivalence class of people living in the same county and same state is contained in an equivalence class of all people living in the same state. For instance a equivalence class of country of $c$ living in state $s$ is a subclass of state $s$. </br>

![problem 51](https://github.com/jigjnasu/discrete_mathematics_and_its_applications/blob/master/chapter_9_relations/9.5_equivalence_relations/repo/problem_51.png)
#### Solution

As per the definition, a partition $P_1$ is called a refinement of partition $P_2$ if every set in $P_1$ is a subset of one of the sets in $P_2$. </br>

As given $P$ is a set of bit strings length of $16$ bits where last $8$ bits are in equivalence. </br>

Let's $Q$ is another set from $P$ where all last 4 bits are $0011$ same, it also means $Q \subseteq P$ and $\therefore$ $Q$ is refinement of $P$ </br>

![problem 52](https://github.com/jigjnasu/discrete_mathematics_and_its_applications/blob/master/chapter_9_relations/9.5_equivalence_relations/repo/problem_52.png)
#### Solution

Let's $\lbrack x \rbrack_{R_{4}}$ is an arbitrary equivalence class for $R_{4}$. </br>
Our claim is $\lbrack x \rbrack_{R_{4}} \subseteq \lbrack x \rbrack_{R_{3}}$. </br>

Let's take a random element $y$ which is equivalent to $x$ under $R_{4}$, which means that $y = x$, or if longer than 4, $y$ has first 4 chars similar to $x$. </br>

As strings which are 4 chars long agree on first 4 chars, will definitely agree on first 3 chars. </br>

$\therefore$ $y$ is equivalent to $x$ under $R_3$ and $y \subseteq [x]_{R_3}$
Hence proved. </br>

![problem 53](https://github.com/jigjnasu/discrete_mathematics_and_its_applications/blob/master/chapter_9_relations/9.5_equivalence_relations/repo/problem_53.png)
#### Solution

Let's $\lbrack x \rbrack_{R_{31}}$ is an arbitrary equivalence class for $R_{31}$. </br>
Our claim is $\lbrack x \rbrack_{R_{31}} \subseteq \lbrack x \rbrack_{R_{8}}$. </br>

Let's take a random element $y$ which is equivalent to $x$ under $R_{31}$, which means that $y = x$, or if longer than 31, $y$ has first 31 chars similar to $x$. </br>

As strings which are 31 chars long agree on first 31 chars, will definitely agree on first 8 chars. </br>

$\therefore$ $y$ is equivalent to $x$ under $R_8$ and $y \subseteq [x]_{R_8}$
Hence proved. </br>

![problem 54](https://github.com/jigjnasu/discrete_mathematics_and_its_applications/blob/master/chapter_9_relations/9.5_equivalence_relations/repo/problem_54.png)
#### Solution

Let $R_1 \subseteq R_2$ </br>
Prove $P_1$ is a refinement of $P_2$ </br>
Let $\lbrack x \rbrack_{R_{1}}$ be an equivalence class in $P_1$ </br>
Prove $\lbrack x \rbrack_{R_{1}}$ is in equivalence class in $P_2$ or $\lbrack x \rbrack_{R_{1}} \subseteq \lbrack x \rbrack_{R_{2}}$ </br>
Let $y \in \lbrack x \rbrack_{R_{1}}$ then $(a,b) \in R_1 \subseteq R_2$ </br>
$\therefore$ $y \in \lbrack x \rbrack_{R_{2}}$ hence proved </br>
On the other hand, let $P_1$ is a refinement of $P_2$ </br>
As $x \in \lbrack x \rbrack_{R_{2}}$ because of refinement, $\lbrack x \rbrack_{R_{1}} \subseteq \lbrack x \rbrack_{R_{2}}$ for all $x \in A$ </br>
This means that for all $y \in A$, we have $(a,b) \in R_1$, $(a, b) \in R_2$ or $R_1 \subseteq R_2$

![problem 55](https://github.com/jigjnasu/discrete_mathematics_and_its_applications/blob/master/chapter_9_relations/9.5_equivalence_relations/repo/problem_55.png)
#### Solution

To make equivalent relations, we should have reflexive, symmetric and transitive relations. </br>
Given $A = \{a,b,c,d,e\}$, equivalent relations containing $(a,b), (a,c), (d,e)$ </br>

Let's add first reflexive relations </br>
$(a,a), (b,b), (c,c), (d,d), (e,e)$ </br>
Let's add symmetric relations </br>
$(b,a), (c,a), (d,d)$ </br>
Let's add transitive  relations </br>
$(b,c), (c,b)$ </br>
If we will add these new relations to the given, we can make equivalent classes as $(a,b,c), (d,e)$ </br>

![problem 56](https://github.com/jigjnasu/discrete_mathematics_and_its_applications/blob/master/chapter_9_relations/9.5_equivalence_relations/repo/problem_56.png)
#### Solution

| operation    | equivalence | Note |
| :----: | :--------:| :------: |
|  $R_1 \bigcup R_2$ | No | The union of two equivalent relations will not be transitive |
|  $R_1 \bigcap R_2$ | Yes | The intersection of two equivalent relations will be equivalent |
|  $R_1 \bigoplus R_2$ | No | The direct sum of two equivalent relations will not be equivalent as the result will not be reflexive |

![problem 57](https://github.com/jigjnasu/discrete_mathematics_and_its_applications/blob/master/chapter_9_relations/9.5_equivalence_relations/repo/problem_57.png)
#### Solution

a) </br>
For this one $x-y = 1$, means all the $\mathbb{Z}$, for instance $-1+2, 3-2$ etc </br>
b) </br>
For this one $x-y=\frac{1}{2}$, for instance $(\frac{5}{2}, \frac{3}{2}), \frac{-1}{2}, \frac{3}{2})$ </br>
This can be also said all $\frac{2n+1}{2} | n \in Z$

![problem 58](https://github.com/jigjnasu/discrete_mathematics_and_its_applications/blob/master/chapter_9_relations/9.5_equivalence_relations/repo/problem_58.png)
#### Solution

a) to be an equivalent relation, it has to be reflexive, symmetric and transitive. </br>
$(b_1, b_2) \in R$, where $b_2$ can be obtained by $b_1$ by rotating it or or rotating it and then reflecting it. </br>
Let's take $R=red$, $B=blue$ and $W=white$ bead. </br>
The following position change can happen in this </br>
1. $0^{\circ}, 120^{\circ}, 240^{\circ}$ rotations. </br>
2. Keep the one bead at same location and interchange the other twos. </br>

##### Reflexive
1. $((R,R), (B,B), (W,W) \in R$ because there is $0^{\circ}$ rotation. </br>

##### Symmetric
$(R,B), (B,R) \in R$ </br>
$(R,W), (W,R) \in R$ </br>
$(B,W), (W,B) \in R$ </br>
because there is rotation and then reflection. </br>

##### Transitive
For instance $(R,B), (B,W), (R,W) \in R$ </br>
because there is rotation and then reflection. </br>

As it is reflexive, symmetric and transitive, it is an equivalence relation.

b) Following are the equivalent classes. </br>
$RRR, RRB, RRW$ </br>
$BBB, BBW, BBR$ </br>
$WWW, WWB, WWR$ </br>
$RBW$ </br>

![problem 59](https://github.com/jigjnasu/discrete_mathematics_and_its_applications/blob/master/chapter_9_relations/9.5_equivalence_relations/repo/problem_59.png)
#### Solution

a) to be an equivalent relation, it has to be reflexive, symmetric and transitive. </br>
$(C_1, C_2) \in R$, where $C_2$ can be obtained by $C_1$ by rotating it or or rotating it and then reflecting it. </br>
Let's take $r=red$, $b=blue$ </br>
The following position change can happen in this </br>
1. $0^{\circ}, 90^{\circ}, 180^{\circ}, 270^{\circ}$ rotations. </br>
2. Keep the one bead at same location and interchange the other twos. </br>

##### Reflexive
1. $((r,r), (b,b) \in R$ because there is $0^{\circ}$ rotation. </br>

##### Symmetric
For instance if $(r,b) \in R$ can be obtained from $90^{\circ}$ rotation clockwise. </br>
Then anti clockwise $(b,r)$ can be obtained by $360 - 90 = 270^{\circ}$ </br>
Therefore it's symmetric by the formula for clockwise $n^{\circ}$ and anti clockwise $(360-n)^{\circ}$ </br>

##### Transitive
For instance $(r,b), (b,r), (r,r) \in R$ </br>
because there is rotation and then reflection. </br>

As it is reflexive, symmetric and transitive, it is an equivalence relation.

b) Following are the equivalent classes. </br>
One color equivalence class $rrrr$ and $bbbb$ </br>
Two color equivalence class $rrrb, rrbr, rbrr, brrr$ and $bbbr, bbrb, brbb, rbbb$ </br>
$rrbb, rbrb, bbrr$ and $bbrr, brbr, rrbb$ </br>


![problem 60](https://github.com/jigjnasu/discrete_mathematics_and_its_applications/blob/master/chapter_9_relations/9.5_equivalence_relations/repo/problem_60.png)
#### Solution

a) We already showed earlier that $f(x)$ is $\theta(g(x))$ if and only if $f(x)$ is $O(g(x))$ and $g(x)$ is $O(f(x))$ </br>

##### Reflexive
We need to show that $f(x)$ is $O(f(x))$, which is clear by taking $C = 1$ and $k = 1$ in the definition. </br>

##### Symmetric
By definition, since if $f(x)$ is $O(g(x))$ and $g(x)$ is $O(f(x))$, then $g(x)$ is $O(f(x))$ and $f(x)$ is $O(g(x))$.

##### Transitive
It is already being proved.

As it is reflexive, symmetric and transitive, it is an equivalence relation.

b) $f(n) = n^2$ </br>
This is the class of all functions that asymptotically grows just as fast as multiple of $f(n) = n^2$. </br>

![problem 61](https://github.com/jigjnasu/discrete_mathematics_and_its_applications/blob/master/chapter_9_relations/9.5_equivalence_relations/repo/problem_61.png)
#### Solution

solution is 5 </br>
1. $\lbrace1,2,3\rbrace$ </br>
2. $\lbrace1\rbrace,\lbrace2\rbrace,\lbrace3\rbrace$ </br>
3. $\lbrace\lbrace1,2\rbrace,\lbrace3\rbrace\rbrace$ </br>
4. $\lbrace\lbrace1,3\rbrace,\lbrace2\rbrace\rbrace$ </br>
5. $\lbrace\lbrace2,3\rbrace,\lbrace1\rbrace\rbrace$ </br>

![problem 62](https://github.com/jigjnasu/discrete_mathematics_and_its_applications/blob/master/chapter_9_relations/9.5_equivalence_relations/repo/problem_62.png)
#### Solution

solution is 5 </br>

1. $\lbrace1,2,3,4\rbrace$ </br>
2. $\lbrace\lbrace1,2,3\rbrace,\lbrace4\rbrace\rbrace$ </br>
3. $\lbrace\lbrace1,2,4\rbrace,\lbrace3\rbrace\rbrace$ </br>
4. $\lbrace\lbrace1,3,4\rbrace,\lbrace2\rbrace\rbrace$ </br>
5. $\lbrace\lbrace2,3,4\rbrace,\lbrace1\rbrace\rbrace$ </br>
6. $\lbrace\lbrace1,2\rbrace,\lbrace3,4\rbrace\rbrace$ </br>
7. $\lbrace\lbrace1,3\rbrace,\lbrace2,4\rbrace\rbrace$ </br>
8. $\lbrace\lbrace1,4\rbrace,\lbrace2,3\rbrace\rbrace$ </br>
9. $\lbrace\lbrace1,2\rbrace,\lbrace3\rbrace,\lbrace4\rbrace\rbrace$ </br>
10. $\lbrace\lbrace1,3\rbrace,\lbrace2\rbrace,\lbrace4\rbrace\rbrace$ </br>
11. $\lbrace\lbrace1,4\rbrace,\lbrace2\rbrace,\lbrace3\rbrace\rbrace$ </br>
12. $\lbrace\lbrace2,3\rbrace,\lbrace1\rbrace,\lbrace4\rbrace\rbrace$ </br>
13. $\lbrace\lbrace2,4\rbrace,\lbrace1\rbrace,\lbrace3\rbrace\rbrace$ </br>
14. $\lbrace\lbrace3,4\rbrace,\lbrace1\rbrace,\lbrace2\rbrace\rbrace$ </br>
15. $\lbrace\lbrace1\rbrace,\lbrace2\rbrace,\lbrace3\rbrace,\lbrace4\rbrace\rbrace$</br>

![problem 63](https://github.com/jigjnasu/discrete_mathematics_and_its_applications/blob/master/chapter_9_relations/9.5_equivalence_relations/repo/problem_63.png)
#### Solution

We do get an equivalence relation. The issue is whether the relation formed in this way is reflexive, transitive and symmetric. It is clearly reflexive, since we included all the pairs $(a,a)$ at the outset. It is clearly transitive, since the last thing we did was to form the transitive closure. It is symmetric by Exercise 23 in Section 9.4. </br>

![problem 64](https://github.com/jigjnasu/discrete_mathematics_and_its_applications/blob/master/chapter_9_relations/9.5_equivalence_relations/repo/problem_64.png)
#### Solution

No. Here is a counterexample. Start with $\lbrace(1, 2), (3, 2)\rbrace$ on the set $\lbrace1, 2, 3\rbrace$. Its transitive closure is itself. The reflexive closure of that is $\lbrace(1, 1), (1, 2), (2, 2), (3, 2), (3, 3)\rbrace$. The symmetric closure of that is $\lbrace(1, 1), (1, 2), (2, 1), (2, 2), (2, 3), (3, 2), (3, 3)\rbrace$. The result is not transitive; for example, $(1, 3)$ is missing. Therefore this is not an equivalence relation. </br>

![problem 65](https://github.com/jigjnasu/discrete_mathematics_and_its_applications/blob/master/chapter_9_relations/9.5_equivalence_relations/repo/problem_65.png)
#### Solution

We end up with the relation $R$ that we started with. Two elements are related if they are in the same set of the partition, but the partition is made up of the equivalence classes of $R$, so two elements are related precisely if they are related in $R$. </br>

![problem 66](https://github.com/jigjnasu/discrete_mathematics_and_its_applications/blob/master/chapter_9_relations/9.5_equivalence_relations/repo/problem_66.png)
#### Solution

Solution is original partition $P$. </br>

![problem 67](https://github.com/jigjnasu/discrete_mathematics_and_its_applications/blob/master/chapter_9_relations/9.5_equivalence_relations/repo/problem_67.png)
#### Solution

1. Build the reflexive closure $R^{'}$ of $R$ by adding missing pair of $(p,p) \in R$. </br>
2. Build the symmetric closure $R^{''}$ of $R$ by adding missing pair of $(p,q) \in R$ the $(q,p) \in R$.</br>
3. Build the transitive closure by Warshall's algorithm of $R^{''}$ by adding missing pairs. </br>

Hence this is the shortest algorithm to make it equivalence relation. </br>

![problem 68](https://github.com/jigjnasu/discrete_mathematics_and_its_applications/blob/master/chapter_9_relations/9.5_equivalence_relations/repo/problem_68.png)
#### Solution

Let's $S = \lbrace1,2,3,...,n\rbrace$$ </br>
For $n = 0$, $p(0)=1$ as $\lbrace\rbrace$ </br>
For $n = 1$, $p(1)=1$ as $\lbrace1\rbrace$ </br>
For $n = 2$, $p(2)=2$ as $\lbrace1,2\rbrace$ and $\lbrace1\rbrace$, $\lbrace2\rbrace$ </br>
For $n = 3$, $p(3)=5$ </br>

As we can see if $j = 0$ to $n -1$, then first can be done in $C(n-1, j)$ ways and remaining can be done p(n-j-1) ways. </br>

![problem 69](https://github.com/jigjnasu/discrete_mathematics_and_its_applications/blob/master/chapter_9_relations/9.5_equivalence_relations/repo/problem_69.png)
#### Solution

$p(0)  = 1$ </br>
$p(1)  = C(0,0) * p(0)$ </br> $\qquad 1 * 1 = 1$ </br>
$p(2)  = C(1,0) * p(1) + C(1,1) * p(0)$ </br> $\qquad 1 * 1 + 1 * 1 = 2$ </br>
$p(3)  = C(2,0) * p(2) + C(2,1) * p(1) + C(2,2) * p(0)$ </br> $\qquad 1 * 2 + 2 * 1 + 1 * 1 = 5$ </br>
$p(4)  = C(3,0) * p(3) + C(3,1) * p(2) + C(3,2) * p(1) + C(3,3) * p(0)$ </br> $\qquad 1 * 5 + 3 * 2 + 3 * 1 + 1 * 1 = 15$ </br>
$p(5)  = C(4,0) * p(4) + C(4,1) * p(3) + C(4,2) * p(2) + C(4,3) * p(1) + C(4,4) * p(0)$ </br> $\qquad 1 * 15 + 4 * 5 + 6 * 2 + 4 * 1 + 1 * 1 = 52$ </br>
$p(6)  = C(5,0) * p(5) + C(5,1) * p(4) + C(5,2) * p(3) + C(5,3) * p(2) + C(5,4) * p(1) + C(5,5) * p(0)$ </br> $\qquad 1 * 52 + 5 * 15 + 10 * 5 + 10 * 2 + 5 * 1 + 1 * 1 = 203$ </br>
$p(7)  = C(6,0) * p(6) + C(6,1) * p(5) + C(6,2) * p(4) + C(6,3) * p(3) + C(6,4) * p(2) + C(6,5) * p(1) + C(6,6) * p(0)$ </br> $\qquad 1 * 203 + 6 * 52 + 15 * 15 + 20 * 5 + 15 * 2 + 6 * 1 + 1 * 1 = 877$ </br>
$p(8)  = C(7,0) * p(7) + C(7,1) * p(6) + C(7,2) * p(5) + C(7,3) * p(4) + C(7,4) * p(3) + C(7,5) * p(2) + C(7,6) * p(1) + C(7,7) * p(0)$ </br> $\qquad 1 * 877 + 7 * 203 + 21 * 52 + 35 * 15 + 35 * 5 + 21 * 2 + 7 * 1 + 1 * 1 = 4140$ </br>
$p(9)  = C(8,0) * p(8) + C(8,1) * p(7) + C(8,2) * p(6) + C(8,3) * p(5) + C(8,4) * p(4) + C(8,5) * p(3) + C(8,6) * p(2) + C(8,7) * p(1) + C(8,8) * p(0)$ </br> $\qquad 1 * 4140 + 8 * 877 + 28 * 203 + 56 * 52 + 70 * 15 + 56 * 5 + 28 * 2 + 8 * 1 + 1 * 1  = 21147$ </br>
$p(10) = C(9,0) * p(9) + C(9,1) * p(8) + C(9,2) * p(7) + C(9,3) * p(6) + C(9,4) * p(5) + C(9,5) * p(4) + C(9,6) * p(3) + C(9,7) * p(2) + C(9,8) * p(1) + C(9,9) * p(0)$ </br>  $\qquad 1 * 21147 + 9 * 4140 + 36 * 877 + 84 * 203 + 126 * 52 + 126 * 15 + 84 * 5 + 36 * 2 + 9 * 1 + 1 * 1 = 115975$ </br>
