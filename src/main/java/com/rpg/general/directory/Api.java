package com.rpg.general.directory;

/**
 * api path for {@link org.springframework.web.bind.annotation.RestController}
 */
public class Api {

    private static final String api = "/api";
    public static final String person = api + "/person";
    public static final String biography = api + "/biography";
    public static final String fraction = api + "/fraction";
    public static final String resource = api + "/resource";

    public class Resource {
        public static final String type = resource + "/type";
    }

    public static final String location = api + "/location";
    public class Location {
        public static final String object = location + "/object";
    }

}
