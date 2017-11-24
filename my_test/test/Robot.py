from sources.Claw import Claw
from sources.Laser import Laser
from sources.SmartPhone import SmartPhone


class Robot:
    def __init__(self):
        self.laser = Laser()
        self.claw = Claw()
        self.phone = SmartPhone()

    def does(self):
         return '''I have many attachments:
  My laser, to %s.
  My claw, to %s.
  My smartphone, to %s.''' % (
        self.laser.does(),
        self.claw.does(),
        self.phone.does())

robot = Robot()


print(robot.does())
