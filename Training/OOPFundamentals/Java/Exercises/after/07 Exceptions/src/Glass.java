public class Glass {

    private float maxGallons;
    private float currentGallons;

    public Glass(float maxGallons) {
        this.maxGallons = maxGallons;
    }

    public void addWater(float gallonsToAdd) throws GlassOverflownException {
        float waterAfterFilling = this.currentGallons + gallonsToAdd;
        if(waterAfterFilling > maxGallons) {
            this.currentGallons = maxGallons;
            throw new GlassOverflownException("glass capacity exceeded;" +
                    " you have spilt " + (waterAfterFilling - this.maxGallons) + " gallons");
        } else {
            this.currentGallons = waterAfterFilling;
        }
    }

}
