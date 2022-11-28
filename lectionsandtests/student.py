class Student:
    def __init__(self, name, house=None):
        if not name:
            raise ValueError("missing name")
        self.name = name
        self.house = house

    def __str__(self) -> str:
        return f'{self.name} from {self.house}'

    @property
    def house(self):
        return self._house

    @house.setter
    def house(self, house):
        if house not in ["Gryffindor", "Hufflepuff", "Ravenclaw", "Slytherin"]:
            raise ValueError("invalid house")
        self._house = house


def main():
    student = get_student()
    #student.house = "number four, privet drive"
    print(student)

def get_student():
    name = input("name ")
    house = input("house ")
    return Student(name, house)

if __name__ == '__main__':
    main()
