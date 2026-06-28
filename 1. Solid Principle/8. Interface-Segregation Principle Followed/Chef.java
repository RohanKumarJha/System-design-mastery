class Chef implements ChefInterface {
    @Override
    public void cooking() {
        System.out.println("Chef is cooking");
    }

    @Override
    public void chopping() {
        System.out.println("Chef is chopping");
    }
}