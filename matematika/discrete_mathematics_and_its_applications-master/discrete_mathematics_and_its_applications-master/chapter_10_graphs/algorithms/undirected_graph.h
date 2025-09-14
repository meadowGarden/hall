#include <iostream>
#include <vector>
#include <queue>
#include <stack>
#include <unordered_map>

class UnDirectedGraph {
public:
    UnDirectedGraph() {}
    ~UnDirectedGraph() {}
    UnDirectedGraph(int v) {
        G.resize(v, std::vector<int>(0));
    }

    void add_edge(const int u, const int v) {
        if (u < G.size() && v < G.size()) {
            G[u].emplace_back(v);
            G[v].emplace_back(u);

        } else {
            std::cout << "Vertex dont' exist, vertex size = " << G.size() << std::endl;
        }
    }

    void bfs(const int start_vertex) const {
        if (start_vertex < 0 && start_vertex >= G.size()) {
            std::cout << "Vertex dont' exist, vertex size = " << G.size() << std::endl;
            return;
        }
        std::unordered_map<int, bool> visited;
        std::queue<int> Q;
        Q.push(start_vertex);
        visited[start_vertex] = true;
        std::cout << "--------------------------------------------------" << std::endl;
        std::cout << "BFS(Breadth First Search)" << std::endl;
        std::cout << "--------------------------------------------------" << std::endl;
        while (!Q.empty()) {
            const int vertex = Q.front();
            Q.pop();
            std::cout << vertex << " ";
            for (const int v : G[vertex]) {
                if (!visited[v]) {
                    Q.push(v);
                    visited[v] = true;
                }
            }
        }
        std::cout << std::endl << "--------------------------------------------------" << std::endl;
    }

    void dfs(const int start_vertex) const {
        if (start_vertex < 0 && start_vertex >= G.size()) {
            std::cout << "Vertex dont' exist, vertex size = " << G.size() << std::endl;
            return;
        }

        std::stack<int> S;
        std::unordered_map<int, bool> visited;
        S.push(start_vertex);
        visited[start_vertex] = true;
        std::cout << "--------------------------------------------------" << std::endl;
        std::cout << "DFS(Depth First Search)" << std::endl;
        std::cout << "--------------------------------------------------" << std::endl;
        while (!S.empty()) {
            const int vertex = S.top();
            S.pop();
            std::cout << vertex << " ";
            for (const int v : G[vertex]) {
                if (!visited[v]) {
                    S.push(v);
                    visited[v] = true;
                }
            }

        }
        std::cout << std::endl << "--------------------------------------------------" << std::endl;
    }

    void dfs_recursive(const int start_vertex) const {
        if (start_vertex < 0 && start_vertex >= G.size()) {
            std::cout << "Vertex dont' exist, vertex size = " << G.size() << std::endl;
            return;
        }
        std::cout << "--------------------------------------------------" << std::endl;
        std::cout << "DFS(Depth First Search) recursive" << std::endl;
        std::cout << "--------------------------------------------------" << std::endl;
        std::unordered_map<int, bool> visited;
        dfs_r(start_vertex, visited);
        std::cout << std::endl << "--------------------------------------------------" << std::endl;
    }

    void show() const {
        std::cout << "--------------------------------------------------" << std::endl;
        std::cout << "Show all the edges of all the vertices" << std::endl;
        std::cout << "--------------------------------------------------" << std::endl;
        for (std::size_t r = 0; r < G.size(); ++r) {
            std::cout << r << " --> ";
            for (std::size_t c = 0; c < G[r].size(); ++c)
                std::cout << G[r][c] << " ";
            std::cout << std::endl;
        }
        std::cout << "--------------------------------------------------" << std::endl;
    }

private:
    std::vector<std::vector<int>> G;

    void dfs_r(const int start_vertex, std::unordered_map<int, bool>& visited) const {
        if (!visited[start_vertex]) {
            std::cout << start_vertex << " ";
            visited[start_vertex] = true;
            for (const int v : G[start_vertex])
                dfs_r(v, visited);
        }
    }
};