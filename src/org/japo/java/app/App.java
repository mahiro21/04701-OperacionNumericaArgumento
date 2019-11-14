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
/**
 *
 * @author Mario Merlos Abella - mario.merlos.alum@iescamp.es
 */
public final class App {

    //Datos
    public static final int N1 = 3;
    public static final int N2 = 8;

    //Constantes de Operación
    public static final int OP_SUM = 0;     // Suma 
    public static final int OP_RES = 1;     // Resta 
    public static final int OP_MUL = 2;     // Producto 
    public static final int OP_DIV = 3;     // Cociente 
    public static final int OP_MOD = 4;     // Resto 
    public static final int OP_MED = 5;     // Media 
    public static final int OP_MAY = 6;     // Mayor 
    public static final int OP_MEN = 7;     // Menor 

    public final void launchApp() {
        System.out.println("OPERACIÓN NUMÉRICA");
        System.out.println("==================");
        System.out.printf("Número 1 ....: %d%n"
                + " Número 2 ....: %d%n"
                + "---%n",
                N1, N2, (int) operar(N1, N2, 6));

    }

    public static final double operar(double n1, double n2, int op) {
        double result = 0;

        switch (op) {
            case OP_SUM:
                result = n1 + n2;
                break;

            case OP_RES:
                result = n1 - n2;
                break;

            case OP_MUL:
                result = n1 * n2;
                break;

            case OP_DIV:
                result = n1 / n2;
                break;

            case OP_MOD:
                result = n1 % n2;
                break;

            case OP_MED:
                result = (n1 + n2) / 2;
                break;

            case OP_MAY:
                result = n1 > n2 ? n1 : n2;
                break;

            case OP_MEN:
                result = n1 < n2 ? n1 : n2;
                break;
        }
        return result;
    }
}
