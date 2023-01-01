package v2;

import v2.Paper.Client;
import v2.Paper.Paper;
import v2.Paper.ServerClient;

import java.util.HashMap;
import java.util.Map;

public class Director {
    private Map<String, Paper> projects = new HashMap<>();

    public void addProject(String name, Paper paper) {
        projects.put(name, paper);
    }

    private void runProject(String name) {
        if (!projects.containsKey(name)) {
            throw new RuntimeException("no proeject");
        }

        Paper paper = projects.get(name);


        /*
         * 무한히 버그를 생성하는 컨텍스트 에러 (특정 상황에서) 를 발생시킨다.
         * 사람이 판별할 수 밖에 없더.
         */
        if (paper instanceof ServerClient) {
            // TODO deploy
        } else if (paper instanceof Client) {
            // TODO deploy
        }
    }

    private void deploy(String projectName, Program...programs) {

    }

}
