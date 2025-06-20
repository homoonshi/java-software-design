# 응집도 (Cohesion)
- 모듈에 포함된 내부 요소들이 연관되어 있는 정도
- 응집도가 높은 모듈은 하나의 모듈 안에 함수나 데이터와 같은 구성 요소들이 <br>하나의 기능을 구현하기 위해 필요한 것들만 배치되어 있고 긴밀히 협력함
- 응집도가 낮은 모듈은 모듈 내부에 서로 관련 없는 함수나 데이터들이 존재하거나 <br> 관련성 적은 여러 기능들이 서로 다른 목적을 추구함
- 응집도가 높으면 기능을 수정할 때 관련 내용이 하나의 모듈에 모여있어 이해하기 쉽고 <br> 수정한 후 관련 없는 다른 모듈에겐 영향을 주지 않아 유지보수에 유리함
- 응집도는 객체 또는 클래스에 얼마나 관련 있는 책임을 할당했는지 나타냄
### 응집도가 높은 클래스 특징
- 단일 책임을 가짐 (SRP)
- 다른 클래스와 잘 협력함
## 종류
| 종류                           | 내용                                                                                                  |
|------------------------------|-----------------------------------------------------------------------------------------------------|
| 기능적 응집도 <br> (Functional)    | 모듈 내부의 모든 기능이 단일 목적을 위해 수행됨 <br> 대입 되는 변수가 공통적으로 사용됨                                                |
| 순차적 응집도 <br> (Sequential)    | 모듈 내에서 한 활동으로부터 나온 출력 값을 다른 활동이 사용함  <br> = 기능 수행 결과 값을 모듈 내 다른 활동이 사용                              |
| 교환적 응집도 <br> (Communication) | 동일한 입출력을 사용해 서로 다른 기능 수행 <br> 통신적 응집도라고도 불림 <br> 메소드 호출에 공통된 파라미터가 입력됨 <br> 순차적과의 차이는 처리 순서가 중요하지 않음 |
| 절차적 응집도 <br> (Procedural)    | 모듈 구성요소가 서로 다른 기능을 하지만 순차적으로 수행 <br> 하나의 클래스에 있는 메소드를 여러개 호출함                                       |
| 시간적 응집도 <br> (Temporal)      | 각 기능 요소들이 순서에 상관없이 특정 시점에 반드시 수행됨 <br> 연관된 기능이라기보다 특정 시간에 처리되어야 하는 활동들을 한 모듈에서 처리                   |
| 논리적 응집도 <br> (Logical)       | 유사한 성격을 갖거나 특정 형태로 분류되는 처리 요소들이 한 모듈에서 처리됨 <br> 논리적으로 비슷한 기능을 수행하나 서로 관계는 밀접하지 않음                   |
| 우연적 응집도 <br> (Coincidental)  | 모듈 내부의 요소들이 서로 관련없는 요소들로만 구성됨                                                                       |