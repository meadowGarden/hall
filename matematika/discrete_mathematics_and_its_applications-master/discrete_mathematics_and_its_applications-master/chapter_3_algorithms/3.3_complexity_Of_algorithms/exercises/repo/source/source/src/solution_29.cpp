#include "solution_29.h"
#include <cstdio>

namespace dc = discrete_mathematics::chapter_3;

dc::Solution_29::Solution_29() {}

dc::Solution_29::~Solution_29() {}

void dc::Solution_29::previous_sum(const std::vector<int>& list) const {
    for (std::size_t p = 2; p < list.size(); ++p) {
        for (std::size_t q = 0; q < p; ++q) {
            int sum = list[q];
            for (std::size_t r = q + 1; r < p; ++r) {
                sum += list[r];
                if (sum == list[p]) {
                    for (std::size_t i = q; i <= r; ++i) {
                        printf("%d + ", list[i]);
                    }
                    printf(" == [%d]\n", list[p]);
                    return;
                }

                if (sum > list[p])
                    break;
            }
        }
    }
}
