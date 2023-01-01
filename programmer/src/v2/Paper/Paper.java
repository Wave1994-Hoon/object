package v2.Paper;

import v2.programmer.Programmer;

/**
 * 제네릭은 추상형을 유지하면서, 구상형을 클라이언트가 결절하게 해주는 로직
 * if 와의 차이점은 형으로 결정된다. 즉 instance of 를 제거할 수 있다.
 */
public interface Paper<T extends Programmer> {
    void setData(T programmer);
}
