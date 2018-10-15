/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Caso3_Bridge;

/**
 *
 * @author Rigo-PC
 */
public class Windows extends SistemaOperativo{

    public Windows(iThreadScheduler IThreadScheduler) {
        super(IThreadScheduler);
    }

    @Override
    public void atenderSolicitud() {
        System.out.print("Atendiendo solicitud en Windows......");
        IThreadScheduler.ejecutar();
    }
    
    
}
