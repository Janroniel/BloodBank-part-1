class BloodData {
    String bloodType;
    String rhFactor;

    public BloodData() {
        bloodType = "O";
        rhFactor = "+";
    }

    public void BloodData(String bt, String rh) {
        this.bloodType = bt;
        this.rhFactor = rh;

        System.out.println(bt + rh + " is added to the blood bank.");
    }

    public void display() {
        System.out.println(bloodType + rhFactor + " is added to the blood bank.");
    }

    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    public String getRhFactor() {
        return rhFactor;
    }

    public void setRhFactor(String rhFactor) {
        this.rhFactor = rhFactor;
    }
}