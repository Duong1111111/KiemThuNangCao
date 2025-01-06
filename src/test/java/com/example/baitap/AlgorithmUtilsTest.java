package com.example.baitap;

import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class AlgorithmUtilsTest {

    @Test
    void testBubbleSort() {
        assertArrayEquals(new int[]{1, 2, 3, 4}, AlgorithmUtils.bubbleSort(new int[]{4, 3, 2, 1}));
        assertArrayEquals(new int[]{}, AlgorithmUtils.bubbleSort(new int[]{})); // Empty array
        assertThrows(IllegalArgumentException.class, () -> AlgorithmUtils.bubbleSort(null));
    }

    @Test
    void testBinarySearch() {
        int[] sortedArray = {1, 2, 3, 4, 5};
        assertEquals(2, AlgorithmUtils.binarySearch(sortedArray, 3));
        assertEquals(-1, AlgorithmUtils.binarySearch(sortedArray, 6)); // Not found
        assertThrows(IllegalArgumentException.class, () -> AlgorithmUtils.binarySearch(null, 3));
    }

    @Test
    void testFibonacci() {
        assertEquals(0, AlgorithmUtils.fibonacci(0));
        assertEquals(1, AlgorithmUtils.fibonacci(1));
        assertEquals(55, AlgorithmUtils.fibonacci(10));
        assertThrows(IllegalArgumentException.class, () -> AlgorithmUtils.fibonacci(-1));
    }

    @Test
    void testPalindrome() {
        assertTrue(AlgorithmUtils.isPalindrome("madam"));
        assertFalse(AlgorithmUtils.isPalindrome("hello"));
        assertThrows(IllegalArgumentException.class, () -> AlgorithmUtils.isPalindrome(null));
    }

    @Test
    void testDijkstra() {
        int[][] graph = {
                {0, 10, 0, 0, 0},
                {10, 0, 5, 0, 0},
                {0, 5, 0, 15, 20},
                {0, 0, 15, 0, 10},
                {0, 0, 20, 10, 0}
        };
        Map<Integer, Integer> result = AlgorithmUtils.dijkstra(graph, 0);
        assertEquals(0, result.get(0)); // Source to itself is 0
        assertEquals(10, result.get(1)); // Shortest path to node 1
        assertEquals(15, result.get(2)); // Shortest path to node 2
    }
}
