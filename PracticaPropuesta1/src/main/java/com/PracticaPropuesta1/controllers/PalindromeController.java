package com.PracticaPropuesta1.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/*
Controlador de tipo Rest que verifica si la palabra es un palindromo o no.
 */
@RestController
public class PalindromeController {

    /**
     * Endpoint para veridicar si la palabra es un palindromo.
     *
     * @param word La palabra a verificar.
     * @return Un mensaje indicando si la palabra ingresada es un palindromo o no.
     */

    @GetMapping("/validar-palindromo/{word}")
    public String palindrome(@PathVariable String word) {
        if (isPalindrome(word)) {
            return "La palabra " + word + " es un palindromo";
        } else {
            return "La palabra " + word + " no es un palindromo";
        }

    }

    private boolean isPalindrome(String word) {
        int length = word.length();

        for (int i = 0; i < length / 2; i++) {
            if (word.charAt(i) != word.charAt(length - i - 1)) {
                return false;
            }
        }
        return true;
    }

}
