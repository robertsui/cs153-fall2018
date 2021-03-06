package cmm.types;

public abstract class BaseType {
  public abstract String toJasminType();
  public abstract String toJasminInstruction();

  public String load(int index) {
    if (index <= 3)
      return String.format("%sload_%d\n", this.toJasminInstruction(), index);
    return this.toJasminInstruction() + "load " + index + "\n";
  }

  public String store(int index) {
    if (index <= 3)
      return String.format("%sstore_%d\n", this.toJasminInstruction(), index);
    return this.toJasminInstruction() + "store " + index + "\n";
  }

  public String mul() {
    return this.toJasminInstruction() + "mul\n";
  }

  public String div() {
    return this.toJasminInstruction() + "div\n";
  }

  public String rem() {
    return this.toJasminInstruction() + "rem\n";
  }

  public String add() {
    return this.toJasminInstruction() + "add\n";
  }

  public String sub() {
    return this.toJasminInstruction() + "sub\n";
  }

  abstract int getLevel();

  public boolean canCastTo(BaseType o) throws Exception {
    int level_a = this.getLevel();
    int level_b = o.getLevel();

    if (level_a == level_b) return true;

    if (level_a != -1 && level_b != -1) {
      return level_a < level_b;
    }

    throw new Exception();
  }
}
