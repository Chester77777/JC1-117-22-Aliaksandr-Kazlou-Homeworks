package lesson03;

public class Task03 {
    public static void main(String[] args) {
        int WhatTimeNow = 24;
        if (WhatTimeNow < 6 | WhatTimeNow == 24) {
            System.out.println("Good night!");
        } else if (WhatTimeNow >= 6 & WhatTimeNow < 12) {
            System.out.println("Good morning!");
        } else if (WhatTimeNow >= 12 & WhatTimeNow < 18) {
            System.out.println("Good day!");
        } else if (WhatTimeNow >= 18 & WhatTimeNow < 24) {
            System.out.println("Good evening!");
        } else {
            System.out.println("This is not a time.");
        }
    }
}
