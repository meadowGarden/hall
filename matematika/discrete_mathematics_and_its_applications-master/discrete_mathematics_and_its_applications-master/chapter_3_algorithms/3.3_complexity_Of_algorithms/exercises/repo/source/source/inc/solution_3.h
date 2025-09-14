#ifndef DISCRETE_MATHEMATICS_CHAPTER_3_COMPLEXITY_OF_ALGORITHMS_SOLUTION_3_H_
#define DISCRETE_MATHEMATICS_CHAPTER_3_COMPLEXITY_OF_ALGORITHMS_SOLUTION_3_H_

/*
  Chapter 3: Complexity Of Algorithms
  Discrete Mathematics and it's applications
  Kenneth H. Rosen

  Solution for exercise 3

  Rakesh Kumar, cpp.rakesh(at)gmail.com
  Date: Feb 9th, 2017
 */

// From first loop, n comparrions
// From second loop, n / 2 comparrions
// From statement, 1 multiplication, 1 comaprission
// Total Cost, n ^ 2 comparrisions, n  / 2 multiplcation
// Total Cost = (n ^ 2) / 2
// Time complexity of this function is always O(n ^ 2).

#include <vector>

namespace discrete_mathematics {
    namespace chapter_3 {
        class Solution_3 {
        public:
            Solution_3();
            ~Solution_3();

            int max_product(const std::vector<int>& A) const;
        };
    };
};

#endif // DISCRETE_MATHEMATICS_CHAPTER_3_COMPLEXITY_OF_ALGORITHMS_SOLUTION_3_H_
