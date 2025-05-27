// Module 1: com.utils
// File: src/com.utils/module-info.java
module com.utils {
    exports com.utils;
}

// File: src/com.utils/com/utils/StringUtils.java
package com.utils;

public class StringUtils {
    public static String reverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }
}

// Module 2: com.greetings
// File: src/com.greetings/module-info.java
module com.greetings {
    requires com.utils;
}

// File: src/com.greetings/com/greetings/Main.java
package com.greetings;

import com.utils.StringUtils;

public class Main {
    public static void main(String[] args) {
        String reversed = StringUtils.reverse("Hello");
        System.out.println("Reversed: " + reversed);
    }
}