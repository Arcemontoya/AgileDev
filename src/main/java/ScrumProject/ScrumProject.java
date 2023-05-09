package ScrumProject;

import net.sf.mpxj.MPXJException;
import net.sf.mpxj.ProjectFile;
import net.sf.mpxj.Task;
import net.sf.mpxj.mpx.MPXReader;
import net.sf.mpxj.mpx.MPXWriter;

import java.io.IOException;

public class ScrumProject {

    public static void main(String []Args) throws MPXJException, IOException {
        ProjectFile project = new MPXReader().read("src/main/Media/Software Development Plan.mpx");

        Task tarea = project.getTaskByID(3);
        //tarea.

        System.out.println(tarea.getName());

        tarea.setName("Prueba de edición");

        new MPXWriter().write(project, "src/main/Media/Software Development Plan.mpx");
        System.out.println(tarea.getName());

    }

}
