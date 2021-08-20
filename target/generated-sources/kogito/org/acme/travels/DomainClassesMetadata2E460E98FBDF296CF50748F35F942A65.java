package org.acme.travels;
public class DomainClassesMetadata2E460E98FBDF296CF50748F35F942A65 {

    public static final org.drools.model.DomainClassMetadata org_acme_travels_Coffee_Metadata_INSTANCE = new org_acme_travels_Coffee_Metadata();
    private static class org_acme_travels_Coffee_Metadata implements org.drools.model.DomainClassMetadata {

        @Override
        public Class<?> getDomainClass() {
            return org.acme.travels.Coffee.class;
        }

        @Override
        public int getPropertiesSize() {
            return 4;
        }

        @Override
        public int getPropertyIndex( String name ) {
            switch(name) {
                case "coffeeType": return 0;
                case "creamType": return 1;
                case "sugarType": return 2;
                case "workStatus": return 3;
             }
             throw new RuntimeException("Unknown property '" + name + "' for class class class org.acme.travels.Coffee");
        }
    }

    public static final org.drools.model.DomainClassMetadata org_acme_travels_Person_Metadata_INSTANCE = new org_acme_travels_Person_Metadata();
    private static class org_acme_travels_Person_Metadata implements org.drools.model.DomainClassMetadata {

        @Override
        public Class<?> getDomainClass() {
            return org.acme.travels.Person.class;
        }

        @Override
        public int getPropertiesSize() {
            return 3;
        }

        @Override
        public int getPropertyIndex( String name ) {
            switch(name) {
                case "adult": return 0;
                case "age": return 1;
                case "name": return 2;
             }
             throw new RuntimeException("Unknown property '" + name + "' for class class class org.acme.travels.Person");
        }
    }

}