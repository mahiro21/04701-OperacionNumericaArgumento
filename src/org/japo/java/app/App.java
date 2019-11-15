/* 
 * Copyright 2019 Mario Merlos Abella - mario.merlos.alum@iescamp.es.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.app;

//import org.japo.java.main.Main;

import java.util.Random;

/**
 *
 * @author Mario Merlos Abella - mario.merlos.alum@iescamp.es
 */
public final class App {

    //Random
    private static final Random RND = new Random();


    //Constantes de Operación
    public static final int OP_SUM = 0;     // Suma 
    public static final int OP_RES = 1;     // Resta 
    public static final int OP_MUL = 2;     // Producto 
    public static final int OP_DIV = 3;     // Cociente 
    public static final int OP_MOD = 4;     // Resto 
    public static final int OP_MED = 5;     // Media 
    public static final int OP_MAY = 6;     // Mayor 
    public static final int OP_MEN = 7;     // Menor

    //Random range
    public static final int MAX = 10;
    public static final int MIN = 0;
    
    //Datos
    public static final int N1;
    public static final int N2;
    
    static{
    N1 = RND.nextInt(MAX - MIN + 1) + MIN;
    N2 = RND.nextInt(MAX - MIN + 1) + MIN;
    }

    public final void launchApp() {
        System.out.println("OPERACIÓN NUMÉRICA");
        System.out.println("==================");
        System.out.printf("Número 1 ....: %d%n", N1);
        System.out.printf("Número 2 ....: %d%n", N2);
        System.out.printf("%d%n", N1, N2, (int) operar(N1, N2, 1));
    }

    public static final double operar(double n1, double n2, int op) {
        double result = 0;

        switch (op) {
            case OP_SUM:
                result = n1 + n2;
                System.out.printf("La Suma es ......: %d", (int)result);
                break;
            case OP_RES:
                result = n1 - n2;
                System.out.printf("La Resta es .....: %d", (int)result);
                break;
            case OP_MUL:
                result = n1 * n2;
                System.out.printf("El Producto es ..: %d", (int)result);
                break;
            case OP_DIV:
                result = n1 / n2;
                System.out.printf("El Cociente es ..: %.2f", result);
                break;
            case OP_MOD:
                result = n1 % n2;
                System.out.printf("El Resto es ......: %.2f", result);
                break;
            case OP_MED:
                result = (n1 + n2) / 2;
                System.out.printf("La Media es ......: %.2f", result);
                break;
            case OP_MAY:
                result = n1 > n2 ? n1 : n2;
                System.out.printf("El Mayor es ......: %d", (int)result);
                break;
            case OP_MEN:
                result = n1 < n2 ? n1 : n2;
                System.out.printf("El Menor es ......: %d", (int)result);
                break;
        }
        return result;
//        return operacione;
    }
}
