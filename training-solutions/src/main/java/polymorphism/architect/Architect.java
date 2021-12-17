package polymorphism.architect;

public class Architect {

    public static void main(String[] args) {
        Plan planSketch = new SketchPlan(50,"Palota");
        Plan planPermit = new PermitPlan(100,"Kastély","John Doe",
                "Szeged, Fő utca 10.");
        Plan planConst = new ConstructionPlan(120,"Piramis","Jane Doe",
                "Egyiptom", 20);

        SketchPlan sketchPlanSketch = new SketchPlan(60, "Paloták");
        SketchPlan sketchPlanPermit = new PermitPlan(110,"Kastélyok","Jack Doe",
                "Szeged, Széchenyi tér");
        SketchPlan sketchPlanConst = new ConstructionPlan(130,"Piramisok",
                "Josephine Doe", "Egyiptom Fő tér", 30);

        Header headerPermit = new PermitPlan(120,"Kastélykák", "Joe Doe",
                "Szeged Damjanich tér");
        Header headerConst = new ConstructionPlan(140,"Piramiskák","Jannet Doe",
                "Egyiptom NemFő tér", 40);

        PermitPlan permitPlanPermit = new PermitPlan(130,"Kastélyocskák",
                "Johny Doe", "Szeged Jancsó utca 10.");
        PermitPlan permitPlanConst = new ConstructionPlan(150,"Piramisockák",
                "Jenna Doe", "Egyiptom Mellék utca",50);

        ConstructionPlan constructionPlanConst = new ConstructionPlan(160,"Sok piramis",
                "June Doe", "Egyiptom Amenhotep tér", 60    );

        System.out.println(planSketch.getPagesOfDocumentation());
        System.out.println(planPermit.getPagesOfDocumentation());
        System.out.println(planConst.getPagesOfDocumentation());

        System.out.println(sketchPlanSketch.getPagesOfDocumentation());
        System.out.println(sketchPlanSketch.getTitle());
        System.out.println(sketchPlanPermit.getPagesOfDocumentation());
        System.out.println(sketchPlanPermit.getTitle());
        System.out.println(sketchPlanConst.getPagesOfDocumentation());
        System.out.println(sketchPlanConst.getTitle());

        System.out.println(headerPermit.getAddressOfBuilding());
        System.out.println(headerPermit.getNameOfClient());
        System.out.println(headerConst.getAddressOfBuilding());
        System.out.println(headerConst.getNameOfClient());

        System.out.println(permitPlanPermit.getAddressOfBuilding());
        System.out.println(permitPlanPermit.getTitle());
        System.out.println(permitPlanPermit.getHeader());
        System.out.println(permitPlanPermit.getNameOfClient());
        System.out.println(permitPlanPermit.getPagesOfDocumentation());

        System.out.println(permitPlanConst.getPagesOfDocumentation());
        System.out.println(permitPlanConst.getTitle());
        System.out.println(permitPlanConst.getHeader());
        System.out.println(permitPlanConst.getNameOfClient());
        System.out.println(permitPlanConst.getAddressOfBuilding());

        System.out.println(constructionPlanConst.getAddressOfBuilding());
        System.out.println(constructionPlanConst.getHeader());
        System.out.println(constructionPlanConst.getTitle());
        System.out.println(constructionPlanConst.getNameOfClient());
        System.out.println(constructionPlanConst.getPagesOfDocumentation());
        System.out.println(constructionPlanConst.getSheetsOfConstructionDrawings());
    }
}
