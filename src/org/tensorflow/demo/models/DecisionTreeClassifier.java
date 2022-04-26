package org.tensorflow.demo.models;

public class DecisionTreeClassifier {

    // Parameters:
    int[] lChilds = {1, 2, 3, -1, 5, 6, -1, 8, 9, 10, -1, -1, 13, -1, 15, -1, -1, -1, -1, 20, 21, 22, 23, -1, -1, -1, 27, -1, -1, 30, 31, -1, 33, 34, -1, -1, 37, -1, -1, -1, 41, 42, 43, -1, 45, 46, 47, -1, -1, -1, 51, 52, -1, -1, 55, -1, -1, 58, -1, -1, 61, 62, -1, -1, 65, 66, 67, 68, -1, 70, 71, -1, 73, -1, 75, 76, -1, -1, 79, 80, -1, -1, 83, 84, 85, -1, -1, -1, 89, -1, -1, -1, 93, -1, -1, 96, -1, -1, 99, -1, -1};
    int[] rChilds = {40, 19, 4, -1, 18, 7, -1, 17, 12, 11, -1, -1, 14, -1, 16, -1, -1, -1, -1, 29, 26, 25, 24, -1, -1, -1, 28, -1, -1, 39, 32, -1, 36, 35, -1, -1, 38, -1, -1, -1, 60, 57, 44, -1, 50, 49, 48, -1, -1, -1, 54, 53, -1, -1, 56, -1, -1, 59, -1, -1, 64, 63, -1, -1, 98, 95, 92, 69, -1, 91, 72, -1, 74, -1, 78, 77, -1, -1, 82, 81, -1, -1, 88, 87, 86, -1, -1, -1, 90, -1, -1, -1, 94, -1, -1, 97, -1, -1, 100, -1, -1};
    double[] thresholds = {0.008195050060749054, 0.8361749947071075, -2.3260499238967896, -2.0, 0.7289700210094452, 0.01010634982958436, -2.0, 0.028480499982833862, -0.004764450015500188, 1.4099990949034691e-05, -2.0, -2.0, 0.002854799968190491, -2.0, 0.0012803350400645286, -2.0, -2.0, -2.0, -2.0, 0.0051975499372929335, -4.1450000935583375e-05, 0.05536499619483948, 0.014852999709546566, -2.0, -2.0, -2.0, 0.04030800051987171, -2.0, -2.0, 0.008039250038564205, 0.010095000267028809, -2.0, -0.0031712499912828207, 0.03302549943327904, -2.0, -2.0, 1.2446499466896057, -2.0, -2.0, -2.0, 0.01589650008827448, 0.0003551599947968498, -0.0003111549885943532, -2.0, -0.0801910012960434, -0.5884350091218948, -0.9886150062084198, -2.0, -2.0, -2.0, -0.0015511999954469502, 0.00012275999688426964, -2.0, -2.0, 0.01927699986845255, -2.0, -2.0, 0.037812501192092896, -2.0, -2.0, -1.6279999613761902, 0.03532950021326542, -2.0, -2.0, 1.1025000214576721, 19.128549575805664, 0.01608099974691868, 0.015496999491006136, -2.0, 0.5217500030994415, -0.008860300295054913, -2.0, -3.4286500215530396, -2.0, 0.29256999492645264, -0.0024091999512165785, -2.0, -2.0, -2.86395001411438, 0.017349999397993088, -2.0, -2.0, 0.005486699985340238, 0.2456749975681305, 0.2432899996638298, -2.0, -2.0, -2.0, 0.04695399850606918, -2.0, -2.0, -2.0, -0.1503250077366829, -2.0, -2.0, 0.24540000408887863, -2.0, -2.0, 0.03916249983012676, -2.0, -2.0};
    int[] indices = {70, 3, 7, -2, 12, 77, -2, 75, 17, 18, -2, -2, 22, -2, 24, -2, -2, -2, -2, 70, 32, 10, 80, -2, -2, -2, 62, -2, -2, 70, 83, -2, 25, 74, -2, -2, 8, -2, -2, -2, 78, 33, 28, -2, 3, 11, 12, -2, -2, -2, 24, 32, -2, -2, 69, -2, -2, 64, -2, -2, 3, 74, -2, -2, 13, 1, 17, 72, -2, 53, 22, -2, 4, -2, 44, 16, -2, -2, 6, 81, -2, -2, 26, 50, 50, -2, -2, -2, 62, -2, -2, -2, 8, -2, -2, 53, -2, -2, 61, -2, -2};
    int[][] classes = {{131, 398}, {79, 64}, {57, 18}, {0, 5}, {57, 13}, {57, 10}, {0, 3}, {57, 7}, {57, 5}, {1, 2}, {0, 2}, {1, 0}, {56, 3}, {51, 0}, {5, 3}, {5, 0}, {0, 3}, {0, 2}, {0, 3}, {22, 46}, {14, 8}, {3, 7}, {3, 1}, {3, 0}, {0, 1}, {0, 6}, {11, 1}, {11, 0}, {0, 1}, {8, 38}, {5, 38}, {2, 0}, {3, 38}, {2, 1}, {2, 0}, {0, 1}, {1, 37}, {0, 37}, {1, 0}, {3, 0}, {52, 334}, {31, 50}, {19, 49}, {6, 0}, {13, 49}, {9, 6}, {2, 6}, {2, 0}, {0, 6}, {7, 0}, {4, 43}, {3, 1}, {3, 0}, {0, 1}, {1, 42}, {1, 0}, {0, 42}, {12, 1}, {12, 0}, {0, 1}, {21, 284}, {4, 1}, {4, 0}, {0, 1}, {17, 283}, {14, 282}, {12, 281}, {10, 280}, {1, 0}, {9, 280}, {8, 280}, {1, 0}, {7, 280}, {1, 0}, {6, 280}, {2, 7}, {2, 0}, {0, 7}, {4, 273}, {1, 2}, {0, 2}, {1, 0}, {3, 271}, {2, 267}, {2, 18}, {0, 18}, {2, 0}, {0, 249}, {1, 4}, {1, 0}, {0, 4}, {1, 0}, {2, 1}, {2, 0}, {0, 1}, {2, 1}, {0, 1}, {2, 0}, {3, 1}, {0, 1}, {3, 0}};

    public DecisionTreeClassifier() {
    }

    public int predict(double[] features) {
        if (features.length == 84) {
            return this.predict(features, 0);
        } else {
            return -1;
        }
    }

    public int predict(double[] features, int node) {
        if (this.thresholds[node] != -2) {
            if (features[this.indices[node]] <= this.thresholds[node]) {
                return predict(features, this.lChilds[node]);
            } else {
                return predict(features, this.rChilds[node]);
            }
        }
        return findMax(this.classes[node]);
    }

    private int findMax(int[] nums) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            index = nums[i] > nums[index] ? i : index;
        }
        return index;
    }

}
