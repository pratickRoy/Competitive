package com.extnds.competitive.problems.gasstation;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GasStationProblemCleanSolutionTest {

    GasStationProblemSolution gasStationProblemSolution;

    @BeforeEach
    public void setup() {
        gasStationProblemSolution = new GasStationProblemCleanSolution();
    }

    @AfterEach
    public void teardown() {
        gasStationProblemSolution = null;
    }

    @Test
    public void getMinStationIndexForCircuitCompletionOrNegativeOneIfNotPossibleTest1() {

        assertEquals(0, gasStationProblemSolution.getMinStationIndexForCircuitCompletionOrNegativeOneIfNotPossible(
            new int[] {0},
            new int[] {0}
        ));
    }

    @Test
    public void getMinStationIndexForCircuitCompletionOrNegativeOneIfNotPossibleTest2() {

        assertEquals(-1, gasStationProblemSolution.getMinStationIndexForCircuitCompletionOrNegativeOneIfNotPossible(
            new int[]{959, 329, 987, 951, 942, 410, 282, 376, 581, 507, 546, 299, 564, 114, 474, 163, 953, 481, 337, 395, 679, 21, 335, 846, 878, 961, 663, 413, 610, 937, 32, 831, 239, 899, 659, 718, 738, 7, 209},
            new int[]{862, 783, 134, 441, 177, 416, 329, 43, 997, 920, 289, 117, 573, 672, 574, 797, 512, 887, 571, 657, 420, 686, 411, 817, 185, 326, 891, 122, 496, 905, 910, 810, 226, 462, 759, 637, 517, 237, 884}
        ));
    }

    @Test
    public void getMinStationIndexForCircuitCompletionOrNegativeOneIfNotPossibleTest3() {


        assertEquals(31, gasStationProblemSolution.getMinStationIndexForCircuitCompletionOrNegativeOneIfNotPossible(
            new int[] { 204, 918, 18, 17, 35, 739, 913, 14, 76, 555, 333, 535, 653, 667, 52, 987, 422, 553, 599, 765, 494, 298, 16, 285, 272, 485, 989, 627, 422, 399, 258, 959, 475, 983, 535, 699, 663, 152, 606, 406, 173, 671, 559, 594, 531, 824, 898, 884, 491, 193, 315, 652, 799, 979, 890, 916, 331, 77, 650, 996, 367, 86, 767, 542, 858, 796, 264, 64, 513, 955, 669, 694, 382, 711, 710, 962, 854, 784, 299, 606, 655, 517, 376, 764, 998, 244, 896, 725, 218, 663, 965, 660, 803, 881, 482, 505, 336, 279 },
            new int[] { 273, 790, 131, 367, 914, 140, 727, 41, 628, 594, 725, 289, 205, 496, 290, 743, 363, 412, 644, 232, 173, 8, 787, 673, 798, 938, 510, 832, 495, 866, 628, 184, 654, 296, 734, 587, 142, 350, 870, 583, 825, 511, 184, 770, 173, 486, 41, 681, 82, 532, 570, 71, 934, 56, 524, 432, 307, 796, 622, 640, 705, 498, 109, 519, 616, 875, 895, 244, 688, 283, 49, 946, 313, 717, 819, 427, 845, 514, 809, 422, 233, 753, 176, 35, 76, 968, 836, 876, 551, 398, 12, 151, 910, 606, 932, 580, 795, 187 }
        ));
    }

    @Test
    public void getMinStationIndexForCircuitCompletionOrNegativeOneIfNotPossibleTest4() {


        assertEquals(33, gasStationProblemSolution.getMinStationIndexForCircuitCompletionOrNegativeOneIfNotPossible(
            new int[] { 336, 279, 204, 918, 18, 17, 35, 739, 913, 14, 76, 555, 333, 535, 653, 667, 52, 987, 422, 553, 599, 765, 494, 298, 16, 285, 272, 485, 989, 627, 422, 399, 258, 959, 475, 983, 535, 699, 663, 152, 606, 406, 173, 671, 559, 594, 531, 824, 898, 884, 491, 193, 315, 652, 799, 979, 890, 916, 331, 77, 650, 996, 367, 86, 767, 542, 858, 796, 264, 64, 513, 955, 669, 694, 382, 711, 710, 962, 854, 784, 299, 606, 655, 517, 376, 764, 998, 244, 896, 725, 218, 663, 965, 660, 803, 881, 482, 505 },
            new int[] { 795, 187, 273, 790, 131, 367, 914, 140, 727, 41, 628, 594, 725, 289, 205, 496, 290, 743, 363, 412, 644, 232, 173, 8, 787, 673, 798, 938, 510, 832, 495, 866, 628, 184, 654, 296, 734, 587, 142, 350, 870, 583, 825, 511, 184, 770, 173, 486, 41, 681, 82, 532, 570, 71, 934, 56, 524, 432, 307, 796, 622, 640, 705, 498, 109, 519, 616, 875, 895, 244, 688, 283, 49, 946, 313, 717, 819, 427, 845, 514, 809, 422, 233, 753, 176, 35, 76, 968, 836, 876, 551, 398, 12, 151, 910, 606, 932, 580 }
        ));
    }

    @Test
    public void getMinStationIndexForCircuitCompletionOrNegativeOneIfNotPossibleTest5() {


        assertEquals(1, gasStationProblemSolution.getMinStationIndexForCircuitCompletionOrNegativeOneIfNotPossible(
            new int[] { 10, 15, 20, 30 },
            new int[] { 11, 14, 19, 29 }
        ));
    }
}