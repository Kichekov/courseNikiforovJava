void main(){
        String str = printUserInfo();
        String str2 = printUserInfo("Vlad", "Kicekov", "36");
        System.out.println(str);
        System.out.println(str2);
        printUserInfoBuilder("Vladlen", "Kicekov", "37");

}

String printUserInfo() {
        String name = "Vladislav";
        String lastName = "Kichekov";
        String age = "35";

        return name + " " + lastName + " " + age;
}

String printUserInfo(String name, String lastName, String age) {
        return name + " " + lastName + " " + age;
}

void printUserInfoBuilder(String name, String lastName, String age) {
        StringBuilder printUser = new StringBuilder();
        printUser.append(name + " ").append(lastName + " ").append(age);
        System.out.println(printUser); ;
}