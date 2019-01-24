public class Glass {
    private float maxGallons, currentGallons;

    public Glass(float maxGallons) {
        this.maxGallons = maxGallons;
    }

    public void addWater(float gallonsToAdd) throws GlassOverflownException {
        float potentialWaterLevel = currentGallons+gallonsToAdd;
        if (potentialWaterLevel>maxGallons) {
            currentGallons = maxGallons;
            throw new GlassOverflownException(potentialWaterLevel-maxGallons);
        }
        else {
            currentGallons = potentialWaterLevel;
        }
    }
}
