//class Solution {
//    public:
//    struct Cmp {
//        bool operator() (const vector<int>& v1, const vector<int>& v2) const {
//            return v1[0] > v2[0];
//        }
//    };
//    vector<int> smallestRange(vector<vector<int>>& nums) {
//        priority_queue<vector<int>, vector<vector<int> >, Cmp> pq;
//        int N = nums.size();
//        for (int i = 0; i < N; ++i) {
//            for (int j = 0; j < nums[i].size(); ++j) {
//                pq.push({nums[i][j], i});
//            }
//        }
//        map<int, int> counts;
//        queue<vector<int> > q;
//        int l = INT_MAX;
//        int r = INT_MIN;
//        int res_l = 0;
//        int res_r = INT_MAX;
//        while (!pq.empty()) {
//            auto v = pq.top();
//            pq.pop();
//            r = max(r, v[0]);
//            l = min(l, v[0]);
//            ++counts[v[1]];
//            q.push(v);
//            while (counts.size() == N && counts[q.front()[1]] > 1) {
//                --counts[q.front()[1]];
//                q.pop();
//                l = q.front()[0];
//            }
//            if (counts.size() == N && r - l < res_r - res_l) {
//                res_l = l;
//                res_r = r;
//            }
//        }
//        return {res_l, res_r};
//    }
//};
//public class huawei1 {
//    public static void main(String[] args) {
//
//
//    }
//}
