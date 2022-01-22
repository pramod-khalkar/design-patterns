package org.patterns.behavioral.state.ex2;

/**
 * Date: 14/11/21
 * Time: 3:10 pm
 * This file is project specific to Groundplay
 * Author: Pramod Khalkar
 */
public class DeliveryContext {
    private PackageState currentPackageState;
    private String packageId;

    public DeliveryContext(PackageState currentPackageState, String packageId) {
        super();
        this.packageId = packageId;
        this.currentPackageState = currentPackageState;
        if (this.currentPackageState == null) {
            this.currentPackageState = Aknowledged.getInstance();
        }
    }

    public PackageState getCurrentPackageState() {
        return currentPackageState;
    }

    public void setCurrentPackageState(PackageState currentPackageState) {
        this.currentPackageState = currentPackageState;
    }

    public void setPackageId(String packageId) {
        this.packageId = packageId;
    }

    public String getPackageId() {
        return packageId;
    }

    public void update() {
        currentPackageState.updateState(this);
    }
}
